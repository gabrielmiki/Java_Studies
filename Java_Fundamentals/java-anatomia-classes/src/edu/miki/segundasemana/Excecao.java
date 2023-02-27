package edu.miki.segundasemana;

import java.util.Scanner;
import java.util.Locale;

public class Excecao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("Insira seu nome:");
            String nome = scanner.next();

            System.out.println("Insira sua idade:");
            int idade = scanner.nextInt();
        }
        catch (Exception e) {
            System.out.println("Erro no processamento de dados");
        }
    }
}
