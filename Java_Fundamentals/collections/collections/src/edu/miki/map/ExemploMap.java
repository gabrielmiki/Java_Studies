package edu.miki.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class ExemploMap {
    
    public static void main(String[] args) {
        
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        System.out.println(carrosPopulares);

        System.out.println("Substitua o consolmo do gol por 15.2");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo Tucson esta no dicionario" + carrosPopulares.containsKey("tucson"));
        System.out.println("Confira se o modelo Uno esta no dicionario" + carrosPopulares.containsKey("uno"));

        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

        // Não viável
        //System.out.println("Exiba o terceiro modelo adicionado");

        System.out.println("Exiba os modelos");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba os consumos");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("Exiba o modelo mais economico e seu consumo");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";
        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
            }
        }
        System.out.println("Modelo mais eficiente: " + modeloMaisEficiente);
        System.out.println("Consumo mais eficiente: " + consumoMaisEficiente);

        System.out.println("Exiba o modelo menos economico e seu consumo");
        Double minValue = Collections.min(carrosPopulares.values());
        Set<Entry<String, Double>> entries2 = carrosPopulares.entrySet();
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry: entries2) {
            if (entry.getValue() == minValue) {
                modeloMenosEficiente = entry.getKey();
            }
        }
        System.out.println("Modelo menos eficiente: " + modeloMenosEficiente);
        System.out.println("Consumo menos eficiente: " + minValue);

        System.out.println("Exiba a soma dos consumos");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("A soma: " + soma);

        System.out.println("Exiba a media dos consumos: " + (soma/carrosPopulares.size()));

        System.out.println("Remova os modelos com o consumo igual a 15.4");
        System.out.println(carrosPopulares);
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator.hasNext()) {
            if (iterator1.next().equals(15.4)) {
                iterator1.remove();
            }
        }
        System.out.println(carrosPopulares);

        System.out.println("Exiba os carros na ordem em que foram informados");
        Map<String, Double> carrosPopularesOrdenados = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopularesOrdenados);

        System.out.println("Exiba o dicionario ordenado pelo modelo");
        Map<String, Double> carrosPopularesOrdenadosModelo = new TreeMap<>(carrosPopulares);
        System.out.println(carrosPopularesOrdenadosModelo);

        System.out.println("Apague o dicionario de carros");
        carrosPopulares.clear();

        System.out.println("Confira se o primeiro dicionario esta vazio: " + carrosPopulares.isEmpty());
        System.out.println("Confira se o segundo dicionario esta vazio: " + carrosPopularesOrdenados.isEmpty());
    }
}
