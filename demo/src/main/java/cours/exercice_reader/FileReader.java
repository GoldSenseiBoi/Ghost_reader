package cours.exercice_reader;

import java.io.File;
import java.io.IOException;

public class FileReader {
    public static void main(String[] args) throws IOException {
        // Chemin vers le fichier à lire
        File file = new File("Ghost_reader/demo/src/main/java/cours/exercice_reader/fichier.txt");

        FileType fileType;
        // Déterminer le type de fichier à partir de l'extension entre  les parenthèses
        String fileName = file.getName();
        
        if (fileName.endsWith(".txt")) {
            fileType = new FileTxt(file.getAbsolutePath()); // Création d'une instance de FileTxt
        } else if (fileName.endsWith(".csv")) {
            fileType = new FileCSV(file.getAbsolutePath()); 
        } else if (fileName.endsWith(".json")) {
            fileType = new FileJson(file.getAbsolutePath()); 
        } else {
            System.out.println("Type de fichier non pris en charge.");
            return; // Sortir si le type de fichier n'est pas pris en charge
        }

        // Utilisation des méthodes pour afficher le contenu
        System.out.println("Contenu à l'endroit:");
        fileType.printContent(); 

        System.out.println("\nContenu à l'envers:");
        fileType.printReverse(); 

        System.out.println("\nContenu en palindrome:");
        fileType.printPalindrome(); 
    }
}

