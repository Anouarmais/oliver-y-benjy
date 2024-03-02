package Partido;

import Equipo.Equipo;
import Persona.Jugador;

import java.util.Date;
import java.util.Random;

public class Simularpartidos {

    private final Random random = new Random();
    private Date fecha;
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private String resultado;
    private int golesLocal;
    private int golesVisitante;

    public Simularpartidos(Date fecha, Equipo equipoLocal, Equipo equipoVisitante) {
        this.fecha = fecha;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
    }

    public void simularPartido() {
        golesLocal = random.nextInt(8);
        golesVisitante = random.nextInt(8);

        mostrarGoles(equipoLocal, golesLocal);
        mostrarGoles(equipoVisitante, golesVisitante);

        mostrarParadasYasistencias(equipoLocal);
        mostrarParadasYasistencias(equipoVisitante);

        resultado = calcularResultado(golesLocal, golesVisitante);
        System.out.println("El resultado ha sido: " + resultado);

        actualizarEstadísticasEquipos();
    }

    private void mostrarGoles(Equipo equipo, int goles) {
        if (equipo.getJugadores().isEmpty()) {
            System.out.println("El equipo " + equipo.getNombreEquipo() + " no tiene jugadores.");
            return;
        }

        System.out.println("Goles del " + equipo.getNombreEquipo() + ":");
        for (int i = 0; i < goles; i++) {
            Jugador jugador = equipo.getJugadores().get(random.nextInt(equipo.getJugadores().size()));
            jugador.setGoles(jugador.getGoles() + 1);
            System.out.println(jugador.getNombre() + " ha marcado un gooooooooooooooooooool!!!!");
        }
    }

    private void mostrarParadasYasistencias(Equipo equipo) {
        for (Jugador jugador : equipo.getJugadores()) {
            if (jugador.getPosicion().equals("Portero")) {
                int paradas = random.nextInt(4);
                jugador.setParadas(paradas);
                System.out.println(jugador.getNombre() + " ha realizado " + paradas + " paradas.");
            } else {
                int asistencias = random.nextInt(4); // Máximo 3 asistencias
                jugador.setAsistencia(asistencias);
                System.out.println(jugador.getNombre() + " ha realizado " + asistencias + " asistencias.");
            }
        }
    }

    private String calcularResultado(int golesLocal, int golesVisitante) {
        return golesLocal + " - " + golesVisitante;
    }

    private void actualizarEstadísticasEquipos() {
        equipoLocal.actualizarEstadísticas(golesLocal, golesVisitante, golesLocal > golesVisitante);
        equipoVisitante.actualizarEstadísticas(golesVisitante, golesLocal, golesVisitante > golesLocal);
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
