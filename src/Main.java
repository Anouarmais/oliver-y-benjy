import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String nombreArchivo = "C:\\Users\\anouar\\Desktop\\oliver-y-benjy\\MuppetFC.txt";
        ArrayList<String>  MuppetFC = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\anouar\\Desktop\\oliver-y-benjy\\MuppetFC.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                MuppetFC.add(linea);
            }
        } catch (IOException e) {
            System.out.println("no se puede leer");
        }

        String ArchivoNewTeam = "C:\\Users\\anouar\\Desktop\\oliver-y-benjy\\NewTeamFC.txt";
        ArrayList<String>  NewTeamFC = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\anouar\\Desktop\\oliver-y-benjy\\NewTeamFC.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                MuppetFC.add(linea);
            }
        } catch (IOException e) {
            System.out.println("no se puede leer");
        }


    }
    }


