package edu.miki.list;

import java.util.Comparator;

/**
 * IdadeComparator implements Comparator<Gatos>
 */
public class IdadeComparator implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }

    
}