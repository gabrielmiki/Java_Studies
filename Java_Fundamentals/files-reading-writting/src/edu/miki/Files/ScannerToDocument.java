package edu.miki.Files;

import java.io.*;
import java.util.Scanner;

public class ScannerToDocument {

    public static void consoleToDocument() throws IOException {

        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Selecione 3 filmes: ");
        pw.flush();

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        File f = new File("/Users/gabriel/GItHub/Java_Studies/Java_Fundamentals/" +
                "files-reading-writting/Test_Files/recomendacoes.txt");

        BufferedWriter bw = new BufferedWriter(new FileWriter(f.getName()));

        while (!(line.equalsIgnoreCase("fim"))) {

            bw.write(line);
            bw.newLine();

            line = scanner.nextLine();

        }

        bw.flush();

        pw.printf("Arquivo \"%s\" criado com sucesso!", f.getName());

        pw.close();
        scanner.close();
        bw.close();

    }

    public static void main(String[] args) throws IOException {

        consoleToDocument();

    }
}
