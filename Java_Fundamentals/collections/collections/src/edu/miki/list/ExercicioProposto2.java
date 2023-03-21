package edu.miki.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto2 {
    
    public static void main(String[] args) {
        
        List<String> perguntas = new ArrayList<>(){{
            add("Telefonou para a vitima?");
            add("Esteve no local do crime?");
            add("Mora perto da vitima?");
            add("Devia para a vitima?");
            add("Ja trabalhou com a vitima");
        }};
        List<String> respostasUsuario = new ArrayList<>();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        for (int i = 0; i < perguntas.size(); i++) {
            System.out.println(perguntas.get(i));
            String resposta = scanner.next();
            respostasUsuario.add(resposta);
        }

        Iterator<String> iterator = respostasUsuario.iterator();
        Integer countSim = 0;
        while(iterator.hasNext()) {
            String resposta = iterator.next();
            if (resposta.equals("Sim")) {
                countSim += 1;
            }
        }
        
        if (countSim == 5) {
            System.out.println("Assassina!");
        }
        else if (countSim >= 3) {
            System.out.println("Cumplice!");
        }
        else if (countSim >= 2) {
            System.out.println("Suspeita!");
        }
        else {
            System.out.println("Inocente!");
        }
    }
}
