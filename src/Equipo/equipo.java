package Equipo;

import Persona.Jugador;
import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;

import java.util.List;

public class equipo {
    public String nombreEquipo ;
    public List<Jugador> Jugadores;

    public equipo(String nombreEquipo, List<Jugador> jugadores) {
        this.nombreEquipo = nombreEquipo;
        this.Jugadores = jugadores;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public List<Jugador> getJugadores() {
        return Jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        Jugadores = jugadores;
    }
}
