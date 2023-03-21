package edu.miki.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
// import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExerciciosPropostos {
    
    public static void main(String[] args) {
        
        Set<String> cores = new HashSet<>(){{
            add("Amarelo");
            add("Verde");
            add("Azul");
            add("Vermelhor");
            add("Violenta");
            add("Magenta");            
        }};

        System.out.println("--\tUsando for\t--");
        for (String cor : cores) {
            System.out.println(cor);
        }
        System.out.println("--\tUsando iterator\t--");
        Iterator<String> iterator = cores.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Tamanho do Set: " + cores.size());

        System.out.println("--\tCores em ordem Alfabética\t--");
        Set<String> coresOrdem = new TreeSet<>(cores);
        for (String cor : coresOrdem) {
            System.out.println(cor);
        }

        System.out.println("--\tCores em ordem Inversa da Informada\t--");
        List<String> coresOrdemInversa = new ArrayList<>(){{
            add("Amarelo");
            add("Verde");
            add("Azul");
            add("Vermelhor");
            add("Violenta");
            add("Magenta"); 
        }};
        for (int i = cores.size() - 1; i >= 0; i--) {
            System.out.println(coresOrdemInversa.get(i));
        }

        System.out.println("--\tCores iniciando com V\t--");
        Iterator<String> iterator2 = cores.iterator();
        System.out.println(cores);
        while (iterator2.hasNext()) {
            String cor = iterator2.next();
            if (cor.startsWith("V")) {
                System.out.println(cor);
            }
        }

        cores.clear();
        System.out.println("Verificando se o conjunto esta vazio: " + cores.isEmpty());
    }
}
