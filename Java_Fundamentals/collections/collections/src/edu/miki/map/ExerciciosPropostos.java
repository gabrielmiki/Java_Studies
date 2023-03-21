package edu.miki.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExerciciosPropostos {
    
    public static void main(String[] args) {
        
        Map<String, Integer> estados = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};

        System.out.println("Substitua a populacao do RN");
        estados.put("RN", 3534165);
        System.out.println(estados);

        System.out.println("Confira se PB esta no dicionario. Caso nao adicione-o");
        if (!estados.containsKey("PB")) {
            estados.put("PB", 4039277);
            System.out.println("Adicionando PE");
        }
        else {
            System.out.println("PB já está presente no dicionário");
        }

        System.out.println("Populacao de PE: " + estados.get("PE"));

        System.out.println("Exiba os estados e populacoes na ordem de entrada");
        Map<String, Integer> estadosOrdenados = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(estadosOrdenados);

        System.out.println("Exiba os estados em ordem alfabetica");
        Map<String, Integer> estadosOrdenadosNome = new TreeMap<>(estados);
        System.out.println(estadosOrdenadosNome);

        System.out.println("Exiba o estado com mennor populacao e a quantidade");
        Integer minPopulacao = Collections.min(estados.values());
        Set<Map.Entry<String, Integer>> entrySet = estados.entrySet();
        String estadoPopulacaoMinima = "";
        for (Map.Entry<String, Integer> entry : entrySet) {
            if (entry.getValue().equals(minPopulacao)) {
                estadoPopulacaoMinima = entry.getKey();
            }
        }
        System.out.println("Estado de Populacao minima: " + estadoPopulacaoMinima);
        System.out.println("Populacao: " + minPopulacao);

        System.out.println("Exiba a soma da populacao desses estados: ");
        Iterator<Integer> iterator = estados.values().iterator();
        Integer soma = 0;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Soma das populacoes: " + soma);

        System.out.println("Media da Populacao: " + (soma / estados.size()));

        System.out.println("Remova os estados com populcao menor do que 4000000");
        System.out.println(estados);
        Iterator<Integer> iterator2 = estados.values().iterator();
        while (iterator2.hasNext()) {
            if (iterator2.next() < 4000000) {
                iterator2.remove();
            }
        }
        System.out.println(estados);

        System.out.println("Apagando o dicionairio");
        estados.clear();
        System.out.println("Verificacao: " + estados.isEmpty());
    }
}
