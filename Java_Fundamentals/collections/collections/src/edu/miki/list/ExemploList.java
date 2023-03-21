package edu.miki.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    
    public static void main(String[] args) {
        
        List<Double> notas1 = new ArrayList<>();
        List<Double> notas2 = new ArrayList<>(Arrays.asList(7d, 8.5, 4.3, 8d, 3.6));

        notas1.add(7d);
        notas1.add(8.5);
        notas1.add(4.3);
        notas1.add(8d);
        notas1.add(3.6);

        System.out.println(notas1);

        System.out.println("Posicao da nota 4.3: " + notas1.indexOf(4.3));

        System.out.println("Adicionando um elemento na posicao 4: ");
        notas1.add(4, 4.5);

        System.out.println(notas1);

        System.out.println("Substitua a nota 8.5 por 6.0: ");
        notas1.set(notas1.indexOf(8.5), 6.0);

        System.out.println(notas1);

        System.out.println("Confira se a nota 10.0 esta na lista: " + notas1.contains(10.0));

        System.out.println("Exiba as notas na ordem em que foram informadas: ");
        for (Double nota : notas1) {
            System.out.println(nota);
        } 

        System.out.println("Exiba a terceira nota adicionada: " + notas1.get(2));

        System.out.println("Exiba a menor nota: " + Collections.min(notas1));

        Iterator<Double> iterator = notas1.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma das notas: " + soma);

        System.out.println("Exiba a media das notas: " + (soma / notas1.size()));

        System.out.println(notas1);
        System.out.println("Remova a nota 7: ");
        notas1.remove(7d);
        System.out.println(notas1);

        System.out.println(notas1);
        System.out.println("Remova posicao 0: ");
        notas1.remove(0);
        System.out.println(notas1);

        System.out.println("Rmova as notas menores do que 7: ");
        System.out.println(notas1);
        Iterator<Double> iterator2 = notas1.iterator();
        while(iterator2.hasNext()) {
            Double next = iterator2.next();

            if (next < 7) {
                iterator2.remove();
            }
        }
        System.out.println(notas1);

        System.out.println("Apague toda a lista: ");
        notas1.clear();
        System.out.println(notas1);

        System.out.println("Confira se a lista esta vazia: " + notas1.isEmpty());
        System.out.println("Confira se a lista esta vazia: " + notas2.isEmpty());
    }
}
