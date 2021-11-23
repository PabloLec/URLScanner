package com.urlscanner.CommandLine;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

/*
* IDEA:
* Une CLI pour naviguer dans le système de fichier
* Prendre un fichier texte sélectionné par l'user
* Chercher les URLs dedans
* Utiliser l'api de https://urlscan.io pour scanner les URLs trouvés
* Remonter le résultat (menace ou pas)
*/
@Command(name = "hello", description = "Says hello")
public class CommandLineInterface implements Runnable {

    @Option(names = { "-s", "--font-size" }, description = "Font size")
    int fontSize = 19;

    @Parameters(paramLabel = "<word>", defaultValue = "Hello, picocli", description = "Words to be translated into ASCII art.")
    private String[] words = { "Hello,", "picocli" };

    @Override
    public void run() {
        // The business logic of the command goes here...
        // In this case, code for generation of ASCII art graphics
        // (omitted for the sake of brevity).
    }

    public static void main(String[] args) {

        System.out.println("Hello, World");
    }

}
