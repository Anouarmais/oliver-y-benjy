import Persona.Jugador;
import Equipo.*;
import Partido.*;
import EquiposRandom.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import EquiposRandom.*;

import static EquiposRandom.Escribirllosequipos.*;


/*Quisiera declararte mi amor pera aqui estoy declarando variables.
-Un poeta
*/
public class Main {
    public static void main(String[] args) {
        // Llama a la función para obtener la lista de jugadores de MuppetFC
        ArrayList<Jugador> jugadoresMuppetFC = MuppetFCequipacion();

        // Verifica si la lista de jugadores no está vacía
        if (!jugadoresMuppetFC.isEmpty()) {
            // No es necesario hacer nada más en el main
            // Los jugadores de MuppetFC están disponibles en la lista jugadoresMuppetFC
            // Puedes realizar cualquier operación adicional que necesites con la lista de jugadores
        } else {
            System.out.println("La lista de jugadores de MuppetFC está vacía.");
        }
    }

    // Tu método MuppetFCequipacion() aquí...

    public static ArrayList<Jugador> MuppetFCequipacion() {
        String nombreArchivo = "C:\\Users\\anouar\\Desktop\\oliver-y-benjy\\MuppetFC.txt";
        ArrayList<Jugador> MuppetFC = new ArrayList<>();

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

                Jugador jugador = new Jugador(nombre, posicion, goles, dorsal, asistencias, paradas);
                MuppetFC.add(jugador);
            }
        } catch (IOException e) {
            System.out.println("No se puede leer el archivo " + nombreArchivo);
        }

        return MuppetFC;
    }
}
