package EquiposRandom;

import Persona.Jugador;
import Equipo.equipo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
public class escribirlLosEquipos {
    public static void escribirEquiposArchivoMuppeet(List<Jugador> equipo , String nombreEquipo, String equiposhechoMuppet){
        try (BufferedWriter escribir = new BufferedWriter(new FileWriter("C:\\Users\\anouar\\Desktop\\oliver-y-benjy\\MuppetFC.txt"))) {

            escribir.write(nombreEquipo + ":");
            escribir.newLine();
            escribir.newLine();
            for (Jugador jugador : equipo) {
                escribir.write(jugador.getNombre() + "-Goles" + jugador.getGoles() + ",Dorsal: " + jugador.getDorsal() + ", Posición :" + jugador.getPosicion() + ", Asistencias: " + jugador.getAsistencia() + ", Paradas: " + jugador.getParada());
                escribir.newLine();

            }
        } catch (IOException e) {
            System.out.println("No  se puede escribir");
        }
    }
    public static void escribirEquiposArchivoNew(List<Jugador> equipo , String nombreEquipo, String equiposhechoNew){

        try (BufferedWriter escribir = new BufferedWriter(new FileWriter("C:\\Users\\anouar\\Desktop\\oliver-y-benjy\\NewTeamFC.txt"))) {

            escribir.write(nombreEquipo + ":" );
            escribir.newLine();

            escribir.newLine();
            for (Jugador jugador : equipo) {
                escribir.write(jugador.getNombre()+ "-Goles" +jugador.getGoles()  + ",Dorsal: " + jugador.getDorsal() + ", Posición :"+jugador.getPosicion()+", Asistencias: " + jugador.getAsistencia() + ", Paradas: " + jugador.getParada());
                escribir.newLine();
            }

        } catch (IOException e) {
            System.out.println("No  se puede escribir");
        }
    }

}
