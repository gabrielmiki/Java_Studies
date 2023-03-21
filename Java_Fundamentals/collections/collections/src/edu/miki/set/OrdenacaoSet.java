package edu.miki.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class OrdenacaoSet {
    
    public static void main(String[] args) {
        
        System.out.println("--\tOrdem Aleatoria\t--");
        Set<Series> minhasSeries = new HashSet<>(){{
            add(new Series("got", "fantasia", 60));
            add(new Series("dark", "drama", 60));
            add(new Series("that '70s show", "comedia", 25));
        }};
        for (Series serie : minhasSeries) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + 
                " - " + serie.getTempoEpisodio());
        }

        System.out.println("--\tOrdem Insercao\t--");
        Set<Series> minhasSeries2 = new LinkedHashSet<>(){{
            add(new Series("got", "fantasia", 60));
            add(new Series("dark", "drama", 60));
            add(new Series("that '70s show", "comedia", 25));
        }};
        for (Series series : minhasSeries2) {
            System.out.println(series.getNome() + " - " + series.getGenero() + " - " + 
                series.getTempoEpisodio());
        }

        System.out.println("--\tOrdem Natural\t--");
        Set<Series> minhaSeries3 = new TreeSet<>(minhasSeries2);
        for (Series series : minhaSeries3) {
            System.out.println(series.getNome() + " - " + series.getGenero() + " - " +
                series.getTempoEpisodio());
        }

        System.out.println("--\tOrdem Nome/Genero/TempoEpisodio\t--");
        Set<Series> minhaSeries4 = new TreeSet<>(new NomeGeneroTempoComparator());
        minhaSeries4.addAll(minhasSeries);
        for (Series series : minhaSeries4) {
            System.out.println(series.getNome() + " - " + series.getGenero() + " - " +
                series.getTempoEpisodio());
        }
    }
}
