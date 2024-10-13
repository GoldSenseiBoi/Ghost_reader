package cours.exercice_reader;

public abstract class FileType implements IfileReader {
    protected String filePath;

    public FileType(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void openFile() {
        System.out.println("Opening file: " + filePath);
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file: " + filePath);
    }

    public abstract void printContent(); // Affiche le contenu du fichier à l'endroit
    public abstract void printReverse(); // Affiche le contenu à l'envers
    public abstract void printPalindrome(); // Affiche le contenu de manière palindrome
}

