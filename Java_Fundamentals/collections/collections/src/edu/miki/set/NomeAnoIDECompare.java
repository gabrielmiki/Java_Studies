package edu.miki.set;

import java.util.Comparator;

/**
 * NomeAnoIDECompare
 */
public class NomeAnoIDECompare implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        Integer nome = o1.getNome().compareToIgnoreCase(o2.getNome());

        if (nome != 0) return nome;

        Integer ano = Integer.compare(o1.getAnoCriacao(), o2.getAnoCriacao());

        if (ano != 0) return ano;

        return o1.getIde().compareToIgnoreCase(o2.getIde());
    }

}