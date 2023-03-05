package edu.miki.terceirasemana;

public class SistemaIBGE {
    public static void main(String[] args) {
        for (EstadosBrasileiros e : EstadosBrasileiros.values()) {
            System.out.println(e.getSigla() + " - " + e.getNome());
        }
    }
}
