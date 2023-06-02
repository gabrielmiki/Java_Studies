package edu.miki.Bytes;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class ByteReadingWritingExample {

    public static void manipulaArquivo() throws IOException {

        File file = new File("/Users/gabriel/GItHub/Java_Studies/Java_Fundamentals/Test_Files/roupas.bin");
        String fileNome = file.getName();

        PrintStream ps = new PrintStream(System.out);
        ps.println("Escolha os produtos para adicionar ao documento: ");
        ps.flush();

        DataOutputStream dos = new DataOutputStream(new FileOutputStream(file.getPath()));

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        ps.println("Nome da peça: ");
        String nomePeca = scanner.nextLine();
        dos.writeUTF(nomePeca);

        ps.print("Tamanho da peca (P/M/G): ");
        char tamanhoPeca = (char) System.in.read();
        dos.writeChar(tamanhoPeca);

        ps.print("Quantidade: ");
        int quantidadePeca = scanner.nextInt();
        dos.writeInt(quantidadePeca);

        ps.print("Preço Unitario: ");
        Double precoPeca = scanner.nextDouble();
        dos.writeDouble(precoPeca);

        ps.printf("O arquivo %s foi criado com sucesso! Seu tamanho é %d e ele localiza-se no diretório %s",
                file.getName(), file.length(), file.getAbsolutePath());

        lerArquivo(file.getAbsolutePath());

        dos.close();
        scanner.close();
        ps.close();

    }

    public static void lerArquivo(String pathArquivo) throws IOException {

        File file = new File(pathArquivo);

        DataInputStream dis = new DataInputStream(new FileInputStream(file.getPath()));

        String nome = dis.readUTF();
        char tamanho = dis.readChar();
        int quantidade = dis.readInt();
        double preco = dis.readDouble();

        System.out.printf("\nNome........: %s\n", nome);
        System.out.printf("Quantidade..: %d\n", quantidade);
        System.out.printf("Tamanho.....: %c\n", tamanho);
        System.out.printf("Preco.......: %f\n", preco);

        dis.close();

    }

    public static void main(String[] args) throws IOException {

        manipulaArquivo();
    }
}
