package exceptions;


import javax.swing.*;
import java.io.*;

public class CheckedExceptions {

    public static void main(String[] args) {

        String nomeArquivo = "romances-blake-crouch.txt";

        try {
            imprimirArquivoNoConsole(nomeArquivo);
        }
        catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado!");
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro insesperado! " +
                    e.getMessage());
            // throw new RuntimeException(e);
        }
        finally {
            System.out.println();
        }

        System.out.println("Apesar de Exception ou não, o programa continua...");
    }

    private static void imprimirArquivoNoConsole(String nomeArquivo) throws IOException {

        File file = new File(nomeArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
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
}
