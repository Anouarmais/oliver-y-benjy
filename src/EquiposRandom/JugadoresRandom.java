package EquiposRandom;
import Equipo.equipo;
import Persona.Jugador;
import Persona.Jugador;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JugadoresRandom {
    public static void generandoEquiposRandom(String nombreArchivo) {
        List<Jugador> jugadoresNewTeam= new ArrayList<>();
        List<Jugador> jugadoresMuppetFC= new ArrayList<>();

            List<String> nombres = obtenerNombresAleatorios("C:\\Users\\anouar\\Documents\\Jugadores.txt");


            List<String> nombresNewTeam = seleccionarNombreAleatorios(nombres);
        List<String> nombresMuppetFC = seleccionarNombreAleatorios(nombres);


        for(String nombre : nombresMuppetFC){ jugadoresMuppetFC.add(crearJugador(nombre , "Muppet FC"));
        }
        for(String nombre : nombresMuppetFC){
            jugadoresNewTeam.add(crearJugador(nombre , "New Team"));
        }
        private static void guardarJugadoresEnArchivo(List<Jugador> jugadores, String nombreEquipo, String nombreArchivo){
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\anouar\\Documents\\equiposhechos(2).txt"))) {
                writer.write(nombreEquipo);
                writer.newLine();
                for (Jugador jugador : jugadores) {
                    writer.write(jugador.toString());
                    writer.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
    private static Jugador crearJugador(String nombre, String equipo) {
        return null;
    }

    private static List<String> seleccionarNombreAleatorios(List<String> nombres) {
        return null;
    }

    private static List<String> obtenerNombresAleatorios(String nombreArchivo) {
        return null;
    }

}
