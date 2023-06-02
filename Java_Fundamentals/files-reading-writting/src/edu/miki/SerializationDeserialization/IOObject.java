package edu.miki.SerializationDeserialization;

import java.io.*;

public class IOObject {

    public static void serealizacao() throws IOException {

        Gato gato = new Gato("Frida", "Malhado", 5);

        File file = new File("gato");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file.getName()));

        oos.writeObject(gato);

        PrintStream ps = new PrintStream(System.out);
        ps.printf("Arquivo \"%s\" criado com sucesso! Tamanho: %d.",
                file.getAbsolutePath(), file.length());

        oos.close();
        ps.close();

    }

    public static void desserealizacao(String filePath) throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));

        Gato gatoObject = (Gato) ois.readObject();

        System.out.println("O nome do gato é: " + gatoObject.getNome());
        System.out.println("A cor do gato é: " + gatoObject.getCor());
        System.out.println("A idade do gato é: " + gatoObject.getIdade());

        ois.close();

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        serealizacao();
        desserealizacao("/Users/gabriel/GItHub/Java_Studies/Java_Fundamentals/files-reading-writting/gato");

    }

}
