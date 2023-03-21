package edu.miki.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ExemploOrdenacaoMap {
    
    public static void main(String[] args) {
        
        System.out.println("--\tOrdem Aleatoria\t--");
        Map<String, Livros> biblioteca = new HashMap<>(){{
            put("Hawking", new Livros("Uma breve historia do tempo", 370));
            put("Duhig", new Livros("O poder do habito", 408));
            put("Harari", new Livros("Licoes para o seculo 21", 432));
        }};
        System.out.println(biblioteca);

        System.out.println("--\tOrdem Insercao\t--");
        Map<String, Livros> bibliotecaOrdenada = new LinkedHashMap<>(){{
            put("Hawking", new Livros("Uma breve historia do tempo", 370));
            put("Duhig", new Livros("O poder do habito", 408));
            put("Harari", new Livros("Licoes para o seculo 21", 432));
        }};
        System.out.println(bibliotecaOrdenada);

        System.out.println("--\tOrdem alfabetica dos autores\t--");
        Map<String, Livros> bibliotecaOrdenadaAutores = new TreeMap<>(){{
            put("Hawking", new Livros("Uma breve historia do tempo", 370));
            put("Duhig", new Livros("O poder do habito", 408));
            put("Harari", new Livros("Licoes para o seculo 21", 432));
        }};
        System.out.println(bibliotecaOrdenadaAutores);

        System.out.println("--\tOrdem Alfabetica Nome Livros\t--");
        Set<Map.Entry<String, Livros>> entries = new TreeSet<>(new EntrySetComparator());
        entries.addAll(biblioteca.entrySet());
        System.out.println(entries);

    }
}
