package edu.miki.primeirasemana;
public class BoletimEstudante {
    public static void main(String[] args) {
        int mediaFinal = 6;
        if(mediaFinal < 6) {
            System.out.println("REPROVADO");
        }
        else if (mediaFinal == 6) {
            System.out.println("PROVA DE RECUPERACAO");
        }
        else {
            System.out.println("APROVADO");
        }
    }
}
