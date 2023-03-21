package edu.miki.set;

import java.util.Comparator;

public class IDECompare implements Comparator<LinguagemFavorita>   {

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        return o1.getIde().compareToIgnoreCase(o2.getIde());
    }
    
}
