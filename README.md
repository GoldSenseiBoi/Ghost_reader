
# 👻 Ghost_reader - Ton lecteur de fichiers ultime ! 📂

Bienvenue dans **Ghost_reader**, un projet qui te permet de lire plusieurs types de fichiers (📜 `.txt`, 📊 `.csv`, 🧮 `.json`) de manière très simple et intuitive. En plus, tu peux afficher le contenu de ces fichiers dans plusieurs formats sympas, comme à l'envers ou en palindrome. 🎉

## 🚀 Fonctionnalités principales :

1. **Détection automatique du type de fichier** :
   - Ghost_reader peut lire les fichiers `.txt`, `.csv` et `.json` en reconnaissant l'extension du fichier.
   
2. **Affichage du contenu** dans différents formats :
   - 📜 **Contenu normal** : Affiche le fichier tel qu'il est.
   - 🔄 **Contenu inversé** : Affiche les lignes du fichier en commençant par la dernière.
   - 🔁 **Contenu palindrome** : Affiche chaque ligne avec les caractères inversés.

## 🔧 Comment ça marche ?

### 1. Installation 📥
Pour utiliser **Ghost_reader**, tu as juste besoin d'une configuration Java fonctionnelle. Télécharge le projet et compile-le comme un projet Java classique.

```bash
# Pour compiler :
javac -d bin src/cours/exercice_reader/*.java

# Pour exécuter :
java -cp bin cours.exercice_reader.FileReader
```

### 2. Utilisation 📚

Le fichier **`FileReader.java`** est ton point d'entrée. Il détecte automatiquement le type de fichier que tu lui passes en fonction de l'extension et applique les bonnes méthodes.

#### Exemple d'utilisation :

```java
import java.io.File;
import java.io.IOException;

public class FileReader {
    public static void main(String[] args) throws IOException {
        // Exemple d'un fichier texte
        File file = new File("chemin/vers/ton/fichier.txt");

        try {
            FileType fileType;

            // On vérifie l'extension du fichier
            String fileName = file.getName();
            if (fileName.endsWith(".txt")) {
                fileType = new FileTxt(file.getAbsolutePath()); // Fichier texte
            } else if (fileName.endsWith(".csv")) {
                fileType = new FileCSV(file.getAbsolutePath()); // Fichier CSV
            } else if (fileName.endsWith(".json")) {
                fileType = new FileJson(file.getAbsolutePath()); // Fichier JSON
            } else {
                System.out.println("Type de fichier non pris en charge.");
                return;
            }

            // Utilisation des méthodes de lecture
            System.out.println("Contenu normal:");
            fileType.printContent(); // Affiche le contenu normal

            System.out.println("\nContenu inversé:");
            fileType.printReverse(); // Affiche le contenu à l'envers

            System.out.println("\nContenu palindrome:");
            fileType.printPalindrome(); // Affiche le contenu palindrome

        } catch (IOException e) {
            e.printStackTrace(); // Gère les erreurs si le fichier n'existe pas ou autre
        }
    }
}
```


### 3. Ajout de nouveaux types de fichiers 🎉

Tu veux ajouter un nouveau type de fichier ? Pas de souci ! Il suffit de créer une nouvelle classe qui hérite de `FileType` et d'implémenter les méthodes :
- `printContent()`
- `printReverse()`
- `printPalindrome()`

Ensuite, ajoute une condition pour ce type de fichier dans `FileReader.java`. Par exemple, si tu veux gérer les fichiers XML :

```java
if (fileName.endsWith(".xml")) {
    fileType = new FileXML(file.getAbsolutePath()); // Fichier XML
}
```

