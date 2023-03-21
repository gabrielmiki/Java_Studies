package edu.miki.decimasemana;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        
        List<Carro> listaCarros = new ArrayList<>();
        
        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Chevrolet"));
        listaCarros.add(new Carro("Wolks"));

        /**
         * Dada a impolementacao de equals ele compara pela marca
         */
        System.out.println(listaCarros.contains(new Carro("Ford")));

        System.out.println(new Carro("Ford").hashCode());
    }
}
