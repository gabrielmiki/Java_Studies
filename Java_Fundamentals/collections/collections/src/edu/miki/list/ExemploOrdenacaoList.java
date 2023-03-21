package edu.miki.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploOrdenacaoList {
    
    public static void main(String[] args) {
        
        List<Gato> listaGatos = new ArrayList<>(){{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};

        System.out.println(listaGatos);

        System.out.println("--\tOrdem Aleatória\t--");
        Collections.shuffle(listaGatos);
        System.out.println(listaGatos);

        System.out.println("--\tOrdem Natural\t--");
        Collections.sort(listaGatos);
        System.out.println(listaGatos);

        System.out.println("--\tOrdem Idade\t--");
        Collections.sort(listaGatos, new IdadeComparator());
        // ou: listaGatos.sort(new IdadeComparator())
        System.out.println(listaGatos);

        System.out.println("--\tOrdem por Cor\t--");
        Collections.sort(listaGatos, new ColorComparator());
        // ou: listaGatos.sort(new ColorComparator())
        System.out.println(listaGatos);

        System.out.println("--\tOrdem por Nome/Cor/Idade\t--");
        Collections.sort(listaGatos, new NomeColorIdadeComparator());
        // ou: listaGatos.sort(new NomeColorIdadeComparator())
        System.out.println(listaGatos);
    }
}