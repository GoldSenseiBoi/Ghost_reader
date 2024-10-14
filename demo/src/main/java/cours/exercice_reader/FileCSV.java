package cours.exercice_reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileCSV extends FileType {

    public FileCSV(String filePath) {
        super(filePath);
    }

    @Override
    public void printContent() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }
    }

    @Override
    public void printReverse() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            StringBuilder content = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                content.insert(0, line + "\n"); // Insère chaque ligne au début pour inverser l'ordre
            }
            System.out.println(content.toString());
        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }
    }

    @Override
    public void printPalindrome() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            StringBuilder content = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                content.append(line).reverse(); // Inverse chaque ligne
                System.out.println(content.toString());
                content.setLength(0); // Réinitialise pour la prochaine ligne
            }
        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }
    }
}
