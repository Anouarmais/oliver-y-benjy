package EquiposRandom;

import Equipo.equipo;
import Persona.Jugador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GeneradorEquipos {
    public static List<Jugador> generandoEquipoMuppetFC(String hacerequipoMuppetFC) {


        List<Jugador> jugadoresMuppetFC = new ArrayList<>();
        List<String> nombres = obtenerNombresAleatorios("C:\\Users\\anouar\\Desktop\\oliver-y-benjy\\Jugadores.txt");
        List<String> nombresMuppetFC = seleccionarNombreAleatorios(nombres);


        for (String nombre : nombresMuppetFC) {
            jugadoresMuppetFC.add(crearJugador(nombre, "Muppet FC"));
        }


        return jugadoresMuppetFC;

    }

    public static List<Jugador> generandoEquipoNewTeam(String hacerequipoNewTeam) {

        List<Jugador> jugadoresNewTeam = new ArrayList<>();


        List<String> nombres = obtenerNombresAleatorios("C:\\Users\\anouar\\Desktop\\oliver-y-benjy\\Jugadores.txt");
        List<String> nombresNewTeam = seleccionarNombreAleatorios(nombres);


        for (String nombre : nombresNewTeam) {
            jugadoresNewTeam.add(crearJugador(nombre, "New Team FC"));

        }


        return jugadoresNewTeam;

    }



    private static Jugador crearJugador(String nombre, String equipo  ) {
        Random random = new Random();
        int goles = 0;
        int asistencias = 0;
        int paradas = 0;
        String[] posiciones = {"Delantero", "Centrocampista", "Defensa", "Portero"};
        String posicion = posiciones[random.nextInt(posiciones.length)];
        int dorsal = random.nextInt(99) + 1;
        return new Jugador(nombre, equipo, posicion, goles, asistencias, paradas, dorsal);
    }

    private static List<String> seleccionarNombreAleatorios(List<String> nombres) {
        Collections.shuffle(nombres);
        return nombres.subList(0, 11);
    }

    private static List<String> obtenerNombresAleatorios(String hacerequipos) {
        List<String> nombres = new ArrayList<>();
        try (BufferedReader leer = new BufferedReader(new FileReader("C:\\Users\\anouar\\Desktop\\oliver-y-benjy\\Jugadores.txt"))) {

            String linea;
            while ((linea = leer.readLine()) != null) {
                nombres.add(linea);
            }
        } catch (IOException e) {

            System.out.println("No se pudo leer");

        }
        return nombres;
    }
}