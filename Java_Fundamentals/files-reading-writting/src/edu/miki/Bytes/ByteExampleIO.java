package edu.miki.Bytes;

import java.io.*;

public class ByteExampleIO {

    public static void copiarArquivo() throws IOException {

        File file = new File("/Users/gabriel/GItHub/Java_Studies/" +
                "Java_Fundamentals/files-reading-writting/recomendacoes.txt");
        String nomeArquivo = file.getName();

//        InputStream is = new FileInputStream(nomeArquivo);
//        BufferedInputStream bis = new BufferedInputStream(is);
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(nomeArquivo));

        String nomeCopy = nomeArquivo.substring(0, nomeArquivo.indexOf(".")).concat("-copy2.txt");
        File copyFile = new File(nomeCopy);

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(nomeCopy));

        int line = 0;
        while ((line = bis.read()) != -1) {

            bos.write((char) line);
            bos.flush();

        }

        bis.close();
        bos.close();

        PrintStream ps = new PrintStream(System.out);
        ps.printf("Arquivo %s criado com sucesso! Localização: Diretório: %s. Tamanho: %d bytes.",
                nomeCopy, copyFile.getPath(), copyFile.length());

    }
    public static void main(String[] args) throws IOException {

        copiarArquivo();

    }
}
