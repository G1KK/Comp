import java.util.*;
import java.io.*;

public class X {
    final static String INPUT_DATA = "path/to/data.txt";
    public static void main(String[] args) {

        // déclarez vos structures des données et variables ici
        
        try (Scanner in = new Scanner(new File(INPUT_DATA))) {

            // code pour extraire les données ici 

        } catch (FileNotFoundException fnf) {
            System.out.println("Le nom du fichier source est introuvable");
            return;
        }

        // code pour utiliser les données ici
    }
}