package edu.miki.Files;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Files {
    public static void main(String[] args) {

        File f = new File("/Users/gabriel/GItHub/Java_Studies/Java_Fundamentals/files-reading-writting/Test_Files");

        System.out.println("Nome do arquivo: " + f.getName());

        System.out.println("Caminho: " + f.getPath());

        System.out.println("Caminho Absoluto: " + f.getAbsolutePath());

        System.out.println("Diretorio pai: " + f.getParent());

        System.out.println("O documento existe? " + f.exists());

        System.out.println("Posso escrever no documento? " + f.canRead());

        System.out.println("Posso ler o documento? " + f.canWrite());

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date data = new Date(f.lastModified());

        System.out.println("Ultima modificação do arquivo: " + df.format(data));

        System.out.println("Tamanho do arquivo: " + f.length() + " bytes.");

    }
}
