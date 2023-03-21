package edu.miki.streamApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ExemploStreamAPI {
    
    public static void main(String[] args) {
        
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista de String: ");

        // numerosAleatorios.stream()
        //     .forEach(new Consumer<String>() {

        //         @Override
        //         public void accept(String t) {
        //             System.out.println(t);
        //         }
                
        //     });

        // numerosAleatorios.stream()
        //     .forEach((String s) -> System.out.println(s));

        // numerosAleatorios.forEach((String s) -> System.out.println(s));

        numerosAleatorios.forEach(System.out::println);

        System.out.println("Pegue os cinco primeiro numeros e coloque dentro de um Set: ");
        numerosAleatorios.stream()
            .limit(5)
            .collect(Collectors.toSet())
            .forEach(System.out::println);

        System.out.println("Transforma essa lista de string em um lista de números inteiros: ");
        // numerosAleatorios.stream()
        //     .map(new Function<String, Integer>() {

        //         @Override
        //         public Integer apply(String t) {
        //             return Integer.parseInt(t);
        //         }
        //        
        //     });
        // numerosAleatorios.stream()
        //     .map((String s) -> Integer.parseInt(s));
        numerosAleatorios.stream()
            .map(Integer::parseInt)
            .collect(Collectors.toList())
            .forEach(System.out::println);


        System.out.println("Pegue os numeross pares maoires do que 2 e coloque em uma lista: ");
        List<Integer> listParesMaiorQue2 = numerosAleatorios.stream()
            .map(Integer::parseInt)
            .filter(i -> i % 2 == 0 && i > 2)
            .collect(Collectors.toList());
        System.out.println(listParesMaiorQue2);

        System.out.println("Mostre a Média dos numeros: ");
        numerosAleatorios.stream()
            .mapToInt(Integer::parseInt)
            .average()
            .ifPresent(System.out::println);;

        System.out.println("Remova os valores impares: ");
        numerosAleatorios.stream()
            .map(Integer::parseInt)
            .filter((Integer i) -> (i % 2 == 0))
            .collect(Collectors.toList())
            .forEach(System.out::println);
        
        List<Integer> numerosImpares = numerosAleatorios.stream()
            .map(Integer::parseInt)
            .collect(Collectors.toList());
        numerosImpares.removeIf((Integer i) -> (i % 2 != 0));
        System.out.println(numerosImpares);

        System.out.println("Ignorar o tres primeiros elementos da lista: ");
        List<Integer> numerosAleatoriosList = numerosAleatorios.stream()
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        for (int i = 0; i < numerosAleatoriosList.size(); i++) {
            if (i >= 2) {
                System.out.println(numerosAleatoriosList.get(i));
            }
        }

        System.out.println("Retirando os números repetidos da lista: ");
        Set<String> semRepetidos = numerosAleatorios.stream()
            .collect(Collectors.toSet());
        System.out.println(semRepetidos);

        System.out.println("Mostre o menor e maior valor da lista: ");
        List<Integer> nums = numerosAleatorios.stream()
            .map(Integer::parseInt)
            .collect(Collectors.toList());
        System.out.println("Menor número: " + Collections.min(nums));
        System.out.println("Maior número: " + Collections.max(nums));

        System.out.println("Mostre a lista na ordem numerica: ");
        Set<Integer> ordemNumerica = new TreeSet<>(nums);
        System.out.println(ordemNumerica);
    }
}
