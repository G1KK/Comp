import java.util.*;
import java.io.*;

public class main {

    final static String INPUT_DATA = "data.txt";

    public static void main(String[] args) {
        // déclarez vos structures des données et variables ici
        ArrayList<String> items;
        try (Scanner scanner = new Scanner(new File(INPUT_DATA))) {
            
            while (scanner.hasNextLine()) {
                items.add(scanner.nextLine());
            }
        } catch (FileNotFoundException fnf) {
            System.out.println("Le nom du fichier source est introuvable");
            return;
        }

    for (l in items) {
        System.out.println(l);
    }

    }
  
}