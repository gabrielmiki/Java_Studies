package edu.miki.Files;

import java.io.*;

public class WriteToExistingDocument {

    public static void copiarArquivo() throws IOException {

        File file = new File("/Users/gabriel/GItHub/Java_Studies/Java_Fundamentals/files-reading-writting/recomendacoes.txt");
        String nomeArquivo = file.getName();

//        Reader r = new FileReader(file.getName());
//        BufferedReader br = new BufferedReader(r);
        BufferedReader br = new BufferedReader(new FileReader(nomeArquivo));
        String line = br.readLine();

        String nomeCopy = nomeArquivo.substring(0, nomeArquivo.indexOf(".")).concat("copy.txt");
        File fileCopy = new File(nomeCopy);

        BufferedWriter bw = new BufferedWriter(new FileWriter(nomeCopy));

        while (!(line == null)) {

            bw.write(line);
            bw.newLine();
            bw.flush();

            line = br.readLine();

        }

        System.out.printf("Arquivo \"%s\" Copiado com Sucesso!\n", nomeArquivo);
        System.out.printf("Arquivo \"%s\" Criado com Sucesso!\n", nomeCopy);

        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Recomende 3 livros: ");
        pw.flush();

        adicionaInfo(fileCopy.getAbsolutePath());

        pw.printf("Informações adicionadas ao arquivo \"%s\" com Sucesso!\n", nomeCopy);
        pw.flush();
        pw.printf("Tamanho final do Arquivo: \"%d\"", fileCopy.length());
        
        bw.close();
        br.close();
        pw.close();

    }

    private static void adicionaInfo(String pathCopy) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter(pathCopy, true));

        while (!(line.equalsIgnoreCase("fim"))) {

            bw.write(line);
            bw.newLine();
            bw.flush();

            line = br.readLine();
        }
    }

    public static void main(String[] args) throws IOException {
        copiarArquivo();
    }
}
