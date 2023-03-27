package exceptions;

import javax.swing.*;
import java.io.*;

public class ExceptionCustomizada {

    public static void main(String[] args) {

        String nomeArquivo = "romances-blake-crouch.txt";


        imprimirArquivoNoConsole(nomeArquivo);


        System.out.println("Apesar de Exception ou não, o programa continua...");
    }

    private static void imprimirArquivoNoConsole(String nomeArquivo) {

        try {
            BufferedReader br = lerArquivo(nomeArquivo);
            String line = br.readLine();

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);
            bw.flush();
            br.close();
        }
        catch (ArberturaArquivoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado! " +
                    e.getMessage());
        }
    }

    private static BufferedReader lerArquivo (String nomeArquivo) throws ArberturaArquivoException {

        File file = new File(nomeArquivo);
        try {
            return new BufferedReader(new FileReader(file.getName()));
        } catch (FileNotFoundException e) {
            throw new ArberturaArquivoException(file.getName(), file.getPath());
        }
    }
}

class ArberturaArquivoException extends Exception {

    private String nome;
    private String caminho;

    public ArberturaArquivoException(String nome, String caminho) {
        super("O arquivo " + nome + " não foi encontrado no " + caminho);
        this.nome = nome;
        this.caminho = caminho;
    }

    @Override
    public String toString() {
        return "ArberturaArquivoException{" +
                "nome='" + nome + '\'' +
                ", caminho='" + caminho + '\'' +
                '}';
    }
}