package edu.miki.primeirasemana.contabanco;

import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);;

        System.out.println("Por favor, digite o seu Nome!");
        String nome = scanner.next();

        System.out.println("Por favor, digite o numero da Agencia!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o seu Numero!");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o seu Saldo!");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + 
            agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
