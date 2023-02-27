package edu.miki.segundasemana;

public class Interacao {
    public static void main(String[] args) {
        String[] listaNome = {"Joao", "Gabriel", "Marcos"};

        for (int i = 0; i < listaNome.length; i++) {
            System.out.println("Participante: " + listaNome[i]);
        }

        for (String nome : listaNome) {
            System.out.println(nome);
        }

        int n = 0;
        while (n < listaNome.length) {
            System.out.println("Mais uma vez: " + listaNome[n]);
            n++;
        }
    }
}
