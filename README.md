# 📁 Mini-projet : Lecteur de Fichiers

Ce projet Java Maven a pour but de créer un lecteur de fichiers capable de lire, inverser et manipuler différents types de fichiers. Il utilise les concepts de programmation orientée objet tels que les interfaces, les classes abstraites, et l'héritage. Le projet est composé de plusieurs classes représentant différents types de fichiers comme `.txt`, `.csv`, et `.json`.

## 🛠️ Structure du Projet

### 1. Interface `IFileReader`
L'interface `IFileReader` définit les méthodes de base que chaque lecteur de fichier doit implémenter :
- `📂 void openFile() : Ouvre le fichier spécifié.
- `❌ void closeFile() : Ferme le fichier.

### 2. Classe Abstraite `FileType`
La classe abstraite `FileType` implémente l'interface `IFileReader` et fournit une implémentation de base pour certaines méthodes communes à tous les types de fichiers.
- Elle gère l'ouverture et la fermeture du fichier en utilisant la classe `BufferedReader`.
- Elle contient des méthodes abstraites que chaque sous-classe doit implémenter.

### 3. Sous-classes pour Différents Types de Fichiers
- **`📜 FileTxt`** : Représente un fichier texte `.txt`. Hérite de `FileType` et utilise les méthodes de la classe parent pour lire et manipuler le contenu.
- **`📊 FileCSV`** : Représente un fichier CSV `.csv`. Hérite de `FileType` et implémente les méthodes pour lire le fichier CSV.
- **`🗂️ FileJson`** : Représente un fichier JSON `.json`. Hérite de `FileType` et implémente les méthodes pour lire le fichier JSON.

### 4. Classe `FileReaderApp`
La classe `FileReaderApp` contient la méthode `main` qui permet de tester les fonctionnalités des différentes sous-classes.
- Elle crée des instances des différentes sous-classes (`FileTxt`, `FileCSV`, `FileJson`) et appelle les méthodes pour afficher le contenu, le contenu inversé, et le contenu palindrome.

## 🚀 Fonctionnalités Implémentées

### 1. 📖 Lecture de Fichier
Chaque sous-classe permet de lire le contenu du fichier. Par exemple, `printContent()` affiche chaque ligne dans l'ordre original.

### 2. 🔄 Affichage en Ordre Inversé
La méthode `printReverse()` lit le fichier, stocke chaque ligne dans une liste, puis l'affiche dans l'ordre inverse.

### 3. 🔁 Affichage Palindrome
La méthode `printPalindrome()` prend chaque ligne du fichier et l'affiche en inversant les caractères, permettant ainsi de voir la version palindrome de chaque ligne.

### 4. 📊 Comparaison de Fichiers
La méthode `compareFiles(IFileReader otherFile)` est définie dans l'interface pour permettre de comparer le contenu de deux fichiers. Cependant, l'implémentation n'a pas été fournie dans ce projet, et peut être ajoutée selon les besoins spécifiques.


## 🌟 Améliorations Futures
- **📊 Implémenter la Comparaison de Fichiers** : Ajouter une logique pour comparer deux fichiers ligne par ligne.
- **🗃️ Gestion des Formats Spécifiques** : Ajouter une logique spécifique pour chaque type de fichier, comme le parsing de fichiers JSON ou CSV.
- **💻 Interface Utilisateur** : Ajouter une interface utilisateur pour rendre l'application plus conviviale.

## 📝 Conclusion
Ce projet est un bon exemple d'utilisation des principes de programmation orientée objet pour créer une application modulaire et extensible. Chaque type de fichier est traité de manière spécifique tout en réutilisant les fonctionnalités communes grâce aux classes abstraites et aux interfaces.

Si vous avez des questions ou des suggestions, n'hésitez pas à les partager ! 😊
