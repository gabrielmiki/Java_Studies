package edu.miki.decimasemana;

import java.util.LinkedList;
import java.util.Queue;

public class FilaCarro {
    
    public static void main(String[] args) {
        
        Queue<Carro> filaCarros = new LinkedList<>();

        filaCarros.add(new Carro("Ford"));
        filaCarros.add(new Carro("Fiat"));
        filaCarros.add(new Carro("Wolks"));

        System.out.println(filaCarros.add(new Carro("Chevrolet")));
        System.out.println(filaCarros);

        System.out.println(filaCarros.offer(new Carro("Renault")));
        System.out.println(filaCarros);

        System.out.println(filaCarros.peek());
        System.out.println(filaCarros);

        System.out.println(filaCarros.poll());
        System.out.println(filaCarros);

        System.out.println(filaCarros.isEmpty());

        System.out.println(filaCarros.size());

    }
}
