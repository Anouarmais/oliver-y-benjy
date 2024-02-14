package Persona;

import java.io.Serializable;

public class Jugador implements Serializable {

    private String nombre;

    private String posicion;

    private int dorsal;
    private int goles;
    private int asistencia;
    private int paradas;

    public Jugador(String nombre, String posicion, int dorsal, int goles, int asistencia, int parada) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.dorsal = dorsal;
        this.goles = 0;
        this.asistencia = 0;
        this.paradas = 0;

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

    public int getAsistencia() {
        return asistencia;
    }


    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }

    public int getParada() {
        return paradas;
    }

    public void setParada(int parada) {
        this.paradas = parada;
    }

    public void actualizarEstadísticas (int golesmarcados , int asistenciaRealizada , int  paradasRealizadas ){
        this.goles += golesmarcados;
        this.asistencia += asistenciaRealizada;
        this.paradas += paradasRealizadas;
    }
}
