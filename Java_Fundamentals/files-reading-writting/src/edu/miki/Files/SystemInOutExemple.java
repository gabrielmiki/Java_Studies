package edu.miki.Files;

import java.io.*;

public class SystemInOutExemple {

    public static void receberTecladoImprimirConsole() throws IOException {

        //    InputStream is = System.in;
        //    InputStreamReader isr = new InputStreamReader(is);
        //    BufferedReader bf = new BufferedReader(isr);
        System.out.println("Recomende 3 filmes: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

//        OutputStream os = System.out;
//        OutputStreamWriter osw = new OutputStreamWriter(os);
//        BufferedWriter bw = new BufferedWriter(osw);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (!(line.isEmpty())) {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {

        receberTecladoImprimirConsole();
    }
}
