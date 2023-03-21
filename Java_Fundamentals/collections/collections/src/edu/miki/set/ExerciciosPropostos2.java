package edu.miki.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExerciciosPropostos2 {

    public static void main(String[] args) {
        
        Set<LinguagemFavorita> linguagens = new HashSet<>(){{
            add(new LinguagemFavorita("Java", 1970, "Intellij"));
            add(new LinguagemFavorita("python", 1990, "VsCode"));
            add(new LinguagemFavorita("JavaScript", 1980, "VsCode"));
        }};

        System.out.println("--\tOrdem de Insercao\t--");
        Set<LinguagemFavorita> linguagensOrdem = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("Java", 1970, "Intellij"));
            add(new LinguagemFavorita("python", 1990, "VsCode"));
            add(new LinguagemFavorita("JavaScript", 1980, "VsCode"));
        }};
        for (LinguagemFavorita lingua : linguagensOrdem) {
            System.out.println(lingua);
        }

        System.out.println("--\tOrdem NAtural\t--");
        Set<LinguagemFavorita> linguagemOrdemNatural = new TreeSet<>(linguagens);
        Iterator<LinguagemFavorita> iterator = linguagemOrdemNatural.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("--\tOrdem pela IDE\t--");
        Set<LinguagemFavorita> linguagemOrdemIDE = new TreeSet<>(new IDECompare());
        linguagemOrdemIDE.addAll(linguagens);
        for (LinguagemFavorita linguagemFavorita : linguagemOrdemIDE) {
            System.out.println(linguagemFavorita);
        }

        System.out.println("--\tOrdem pelo Nome/Ano/IDE");
        Set<LinguagemFavorita> linguaOrdemNomeAnoIDE = new TreeSet<>(new NomeAnoIDECompare());
        linguaOrdemNomeAnoIDE.addAll(linguagens);
        Iterator<LinguagemFavorita> iterator3 = linguaOrdemNomeAnoIDE.iterator();
        while (iterator3.hasNext()) {
            System.out.println(iterator3.next());
        }
        
    }
}
