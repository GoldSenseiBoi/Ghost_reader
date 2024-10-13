package cours.exercice_reader;

public class FileCSV extends FileType {

    public FileCSV(String filePath) {
        super(filePath);
    }

    @Override
    public void printContent() {
        System.out.println("Printing file content in original order.");
    }

    @Override
    public void printReverse() {
        System.out.println("Printing file content in reverse order.");
    }

    @Override
    public void printPalindrome() {
        System.out.println("Printing file content in palindrome.");
    }
}
