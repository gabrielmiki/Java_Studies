package edu.miki.list;

import java.util.Comparator;

public class ColorComparator implements Comparator<Gato> {

    @Override
    public int compare(Gato o1, Gato o2) {
        return o1.getCor().compareToIgnoreCase(o2.getCor());
    }
    
}
