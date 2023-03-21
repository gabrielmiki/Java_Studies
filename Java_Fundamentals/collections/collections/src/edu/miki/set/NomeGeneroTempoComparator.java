package edu.miki.set;

import java.util.Comparator;

public class NomeGeneroTempoComparator implements Comparator<Series> {

    @Override
    public int compare(Series serie1, Series series2) {
        Integer nomeComparator = serie1.getNome().compareTo(series2.getNome());
        if (nomeComparator != 0) return nomeComparator;

        Integer numComparator = Integer.compare(serie1.getTempoEpisodio(),series2.getTempoEpisodio());
        if (numComparator != 0) return numComparator;

        return serie1.getGenero().compareToIgnoreCase(series2.getGenero());
    }
    
}
