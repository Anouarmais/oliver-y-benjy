package Persona;

import java.io.Serializable;

public class Jugador implements Serializable {

    private String nombre;

    private String posicion;

    private int dorsal;
    private int goles;
    private int asistencias;
    private int paradas;

    public Jugador(String nombre, String posicion, int goles, int asistencias, int paradas, int dorsal) {
        this.nombre = nombre;

        this.posicion = posicion;
        this.goles = goles;
        this.asistencias = asistencias;
        this.paradas = paradas;
        this.dorsal = dorsal;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getAsistencia(int asistencias) {
        return asistencias;
    }


    public void setAsistencia(int asistencia) {
        this.asistencias = asistencia;
    }

    public int getParadas() {
        return paradas;
    }

    public void setParadas(int parada) {
        this.paradas = parada;
    }

    public void actualizarEstadísticas (int golesmarcados , int asistenciaRealizada , int  paradasRealizadas ){
        this.goles += golesmarcados;
        this.asistencias += asistenciaRealizada;
        this.paradas += paradasRealizadas;
    }
}
