package edu.miki.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
    
    public static void main(String[] args) {
        
        // Set<Double> notas = new HashSet<>();
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d,3.6));
        System.out.println(notas);

        // Operacoes nao possiveis de se realizar com o set
        // System.out.println("Exiba a posicao da nota 5: ");
        // System.out.println("Adicione uma nota 8 na posicao 4: ");
        // System.out.println("Substitua a nota 5 por 6: ");
        // System.out.println("Exiba a terceira nota adicionada");
        // System.out.println("Remova a nota na posicao zero: ");

        System.out.println("Confira se a nota 5 esta no conjunto: " + notas.contains(5d));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double nota = iterator.next();
            soma += nota;
        }
        System.out.println(soma);

        System.out.println("A media das notas: " + (soma / notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) {
                iterator1.remove();
            }
        }
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem que foram informadas");
        Set<Double> notas2 = new HashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("exiba as notas em ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague todo conjunto: ");
        notas.clear();

        System.out.println("Confira se o conjunto notas esta vazio:" + notas.isEmpty());
        System.out.println("Confira se o conjunto notas2 esta vazio:" + notas2.isEmpty());
    }
}
