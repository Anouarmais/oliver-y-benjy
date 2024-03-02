package EquiposRandom;

import Persona.Jugador;
import Equipo.Equipo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Escribirllosequipos {

    private int asistencias;
    public static ArrayList MuppetFC = MuppetFCequipacion();
    public static ArrayList NewTeamFC=NewFCequipacion();

    public static ArrayList MuppetFCequipacion(){
        String nombreArchivo = "C:\\Users\\anouar\\Desktop\\oliver-y-benjy\\MuppetFC.txt";
        ArrayList<Jugador>  MuppetFC = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datosJugador = linea.split(",");
                String nombre = datosJugador[0].split(":")[1].trim();
                int goles = Integer.parseInt(datosJugador[1].split(":")[1].trim());
                int dorsal = Integer.parseInt(datosJugador[2].split(":")[1].trim());
                String posicion = datosJugador[3].split(":")[1].trim();
                int asistencias = Integer.parseInt(datosJugador[4].split(":")[1].trim());
                int paradas = Integer.parseInt(datosJugador[5].split(":")[1].trim());

                Jugador jugador = new Jugador(nombre,posicion ,  goles, dorsal, asistencias, paradas);
                MuppetFC.add(jugador);
            }
        } catch (IOException e) {
            System.out.println("No se puede leer el archivo " + nombreArchivo);
        }

        return MuppetFC;
    }

    public static   ArrayList NewFCequipacion(){
        String nombreArchivo = "C:\\Users\\anouar\\Desktop\\oliver-y-benjy\\NewTeamFC.txt";
        ArrayList<Jugador>  NewTeamFC = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datosJugador = linea.split(",");
                String nombre = datosJugador[0].split(":")[1].trim();
                int goles = Integer.parseInt(datosJugador[1].split(":")[1].trim());
                int dorsal = Integer.parseInt(datosJugador[2].split(":")[1].trim());
                String posicion = datosJugador[3].split(":")[1].trim();
                int asistencias = Integer.parseInt(datosJugador[4].split(":")[1].trim());
                int paradas = Integer.parseInt(datosJugador[5].split(":")[1].trim());

                Jugador jugador = new Jugador(nombre,posicion ,  goles, dorsal, asistencias, paradas);
                MuppetFC.add(jugador);
            }
        } catch (IOException e) {
            System.out.println("No se puede leer el archivo " + nombreArchivo);
        }

        return NewTeamFC;
    }

    Equipo ALNEW = new Equipo("NewTeamFC" , NewFCequipacion(),0,0,0);
    Equipo ALMUPPET = new Equipo("MuppetFC" , MuppetFCequipacion(),0,0,0);

    public Object getALNEW() {
        return ALNEW;
    }

    public Object getALMUPPET() {
        return ALMUPPET;
    }



    public  void escribirEquiposArchivoMuppeet(List<Jugador> equipo , String nombreEquipo){
        try (BufferedWriter escribir = new BufferedWriter(new FileWriter("C:\\Users\\anouar\\Desktop\\oliver-y-benjy\\MuppetFC.txt"))) {

            escribir.write(nombreEquipo + ":" + "partidos Ganados" + ALMUPPET.getPartidosGanados() + "partidos Perdidos"+ALMUPPET.partidosPerdidos + "Empatados"+ ALMUPPET.partidosempatados);
            escribir.newLine();
            escribir.newLine();
            for ( Jugador jugador : equipo) {
                escribir.write(jugador.getNombre() + "-Goles" + jugador.getGoles() + ",Dorsal: " + jugador.getDorsal() + ", Posición :" + jugador.getPosicion() + ", Asistencias: " + jugador.getAsistencia(asistencias) + ", Paradas: " + jugador.getParadas());
                escribir.newLine();

            }
        } catch (IOException e) {
            System.out.println("No  se puede escribir");
        }
    }

    public  void escribirEquiposArchivoNew(List<Jugador> equipo , String nombreEquipo){

        try (BufferedWriter escribir = new BufferedWriter(new FileWriter("C:\\Users\\anouar\\Desktop\\oliver-y-benjy\\NewTeamFC.txt"))) {

            escribir.write(nombreEquipo + ":" + "partidos Ganados" + ALNEW.getPartidosGanados() + "partidos Perdidos"+ALNEW.partidosPerdidos + "Empatados"+ ALNEW.partidosempatados);
            escribir.newLine();



            escribir.newLine();
            for (Jugador jugador : equipo) {
                escribir.write(jugador.getNombre()+ "-Goles" +jugador.getGoles()  + ",Dorsal: " + jugador.getDorsal() + ", Posición :"+jugador.getPosicion()+", Asistencias: " + jugador.getAsistencia(asistencias) + ", Paradas: " + jugador.getParadas());
                escribir.newLine();
            }

        } catch (IOException e) {
            System.out.println("No  se puede escribir");
        }

    }
    public static ArrayList<String> getMuppetFC() {
        return MuppetFC;
    }
    public static ArrayList<String> getNewTeamFC() {
        return NewTeamFC;
    }
}
