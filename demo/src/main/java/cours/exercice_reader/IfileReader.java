package cours.exercice_reader;

public interface IfileReader {
    void openFile();
    void closeFile();
    void printContent();
    void printReverse();
    void printPalindrome();
    boolean compareFiles(IfileReader otherFile);
}

