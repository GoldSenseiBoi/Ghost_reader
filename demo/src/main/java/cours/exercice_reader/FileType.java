package cours.exercice_reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class FileType implements IfileReader {
    protected String filePath;
    protected BufferedReader reader;

    public FileType(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void openFile() {
        try {
            reader = new BufferedReader(new FileReader(filePath));
            System.out.println("Fichier ouvert : " + filePath);
        } catch (IOException e) {
            System.out.println("Erreur lors de l'ouverture du fichier : " + filePath + " (" + e.getMessage() + ")");
            reader = null;
        }
    }

    @Override
    public void closeFile() {
        try {
            if (reader != null) {
                reader.close();
                System.out.println("Fichier fermé : " + filePath);
            }
        } catch (IOException e) {
            System.out.println("Erreur lors de la fermeture du fichier : " + e.getMessage());
        }
    }

    public abstract void printContent(); // Affiche le contenu du fichier à l'endroit
    public abstract void printReverse(); // Affiche le contenu à l'envers
    public abstract void printPalindrome(); // Affiche le contenu de manière palindrome
}
