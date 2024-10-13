package cours.exercice_reader;

import java.io.IOException;

public class FileReader {

    public static void main(String[] args) throws IOException {
        FileTxt fileTxt = new FileTxt("fichier.txt");
        fileTxt.openFile();
        fileTxt.printContent();
        fileTxt.printReverse();
        fileTxt.printPalindrome();
        fileTxt.closeFile();

        FileCSV fileCSV = new FileCSV("example.csv");
        fileCSV.openFile();
        fileCSV.printContent();
        fileCSV.printReverse();
        fileCSV.printPalindrome();
        fileCSV.closeFile();

        FileJson fileJson = new FileJson("example.json");
        fileJson.openFile();
        fileJson.printContent();
        fileJson.printReverse();
        fileJson.printPalindrome();
        fileJson.closeFile();
    }
}

