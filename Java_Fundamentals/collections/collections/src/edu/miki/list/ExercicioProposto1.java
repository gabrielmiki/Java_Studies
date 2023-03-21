package edu.miki.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto1 {
    
    public static void main(String[] args) {
        
        List<Double> temperaturas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Double temp;

        for (int i = 0; i < 6; i++) {
            temp = scanner.nextDouble();
            temperaturas.add(temp);
        }

        System.out.println(temperaturas);

        Double soma = 0d;
        for (Double t : temperaturas) {
            soma += t;
        }
        Double media = soma / temperaturas.size();
        System.out.println("A média das temperaturas nesse semestre foi de: " + (media));

        // List<Double> tempAcimaMedia = new ArrayList<>();
        // Iterator<Double> iterator = temperaturas.iterator();
        // while (iterator.hasNext()) {
        //     Double next = iterator.next();

        //     if (next > media) {
        //         tempAcimaMedia.add(next);
        //     }
        // }
        List<String> mesList = new ArrayList<>(){{
            add("Janeiro");
            add("Fevereiro");
            add("Marco");
            add("Abril");
            add("Maio");
            add("Junho");
        }};
        for (int t = 0; t < temperaturas.size(); t++) {
            if (temperaturas.get(t) > media) {
                System.out.println(t + " " + mesList.get(t) + ": " + temperaturas.get(t));
            }
        }

    }
}
