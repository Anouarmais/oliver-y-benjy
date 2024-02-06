package Persona;

import java.io.Serializable;

public class Jugador implements Serializable {

    private String nombre;

    private String posicion;

    private int dorsal;
    private int goles;
    private int asistencia;
    private int parada;

    public Jugador(String nombre, String posicion, int dorsal, int goles, int asistencia, int parada) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.dorsal = dorsal;
        this.goles = goles;
        this.asistencia = asistencia;
        this.parada = parada;

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
        return parada;
    }

    public void setParada(int parada) {
        this.parada = parada;
    }
}
