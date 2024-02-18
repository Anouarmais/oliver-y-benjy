package Equipo;

import Persona.Jugador;


import java.util.ArrayList;
import java.util.List;

public class equipo {
    public String nombreEquipo ;
    public List<Jugador> Jugadores;

    public int partidosGanados ;
    public int golesAfavor;
    public int partidosPerdidos;
    public int partidosempatados ;
    public int golesEncontra;

    public equipo(String nombreEquipo, List<Jugador> jugadores, int partidosGanados, int golesAfavor, int partidosPerdidos, int partidosempatados) {
        this.nombreEquipo = nombreEquipo;
        Jugadores = new ArrayList<>();
        this.partidosGanados = 0;
        this.golesAfavor = 0;
        this.partidosPerdidos = 0;
        this.partidosempatados = 0;

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

    public int getPartidosGanados() {
        return partidosGanados;
    }

    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    public int getGolesAfavor() {
        return golesAfavor;
    }

    public void setGolesAfavor(int golesAfavor) {
        this.golesAfavor = golesAfavor;
    }

    public int getPartidosPerdidos() {
        return partidosPerdidos;
    }

    public void setPartidosPerdidos(int partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }

    public int getPartidosempatados() {
        return partidosempatados;
    }

    public void setPartidosempatados(int partidosempatados) {
        this.partidosempatados = partidosempatados;
    }

    public int getGolesEncontra() {
        return golesEncontra;
    }

    public void setGolesEncontra(int golesEncontra) {
        this.golesEncontra = golesEncontra;
    }
    public void actualizarEstadísticas (int golesmarcados , int golesrecibidos , boolean gandao){
        if(gandao = true){
            partidosGanados++;
        } else if (golesmarcados< golesEncontra) {
            partidosPerdidos++;
        }
        else{
            partidosempatados++;
        }
        this.golesAfavor += golesmarcados;
        this.golesEncontra += golesrecibidos;

    }
}


