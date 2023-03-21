package edu.miki.list;

import java.util.Comparator;

public class NomeColorIdadeComparator implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        Integer nome = g1.getNome().compareToIgnoreCase(g2.getNome());

        if (nome != 0) {
            return nome;
        }
        else {
            Integer cor = g1.getCor().compareToIgnoreCase(g2.getCor());

            if (cor != 0) {
                return cor;
            }
            else {
                Integer idade = Integer.compare(g1.getIdade(), g2.getIdade());

                if (idade != 0) {
                    return idade;
                }
            }
        }

        return 0;
    }

}
