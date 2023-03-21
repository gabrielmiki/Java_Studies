package edu.miki.bootcamp;

import edu.miki.bootcamp.cursos.Curso;
import edu.miki.bootcamp.dev.Developer;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Curso cursoJava = new Curso("Curso Intensivo Java", 60);
        cursoJava.setLinguagensUtilizadas(1);
        System.out.println(cursoJava);

        cursoJava.setTemaPrincipal("Desenvolver as habilidades em Java rapidamente.");
        cursoJava.setDescricao("Trabalhar os conceitos basicos da linguagem Java e implementar " +
                "diferentes projetos.");

        Curso cursoJavaScript = new Curso("Curso Inciante Web Developement", 80);
        cursoJava.setLinguagensUtilizadas(1);
        System.out.println(cursoJavaScript);

        cursoJavaScript.setTemaPrincipal("Iniciar os conceitos e linguagens de densenvolvimento Web.");
        cursoJavaScript.setDescricao("Percorrer os fundamentos do desenvolvimento web de forma detalhada e " +
                "seccionada e finalizar com um projeto de maior magnitude.");

        Curso cursoC = new Curso("Curso C", 50);
        cursoJava.setLinguagensUtilizadas(1);
        System.out.println(cursoJava);

        cursoC.setTemaPrincipal("Desenvolver conceitos da linguagem C.");
        cursoC.setDescricao("Estruturar parte teórica da linguagem C e apresentar seus usos e possibilidades.");

        Developer dev1 = new Developer("Joao", 24, Arrays.asList("Python", "Java"));
        Developer dev2 = new Developer("Gabriel", 23, Arrays.asList("Python", "Java", "JavaScript"));
        Developer dev3 = new Developer("Marcela", 19, Arrays.asList("C"));
        Developer dev4 = new Developer("Carla", 29, Arrays.asList("C", "JavaScript"));

        Map<String, List<String>> developerELinguas = new HashMap(){{
            put(dev1.getNome(), dev1.getLinguagensFavoritas());
            put(dev2.getNome(), dev2.getLinguagensFavoritas());
            put(dev3.getNome(), dev3.getLinguagensFavoritas());
            put(dev4.getNome(), dev4.getLinguagensFavoritas());
        }};

        List<String> javaUsers = cursoJava.developersFiltra(developerELinguas, "Java");
        List<String> javaScriptUsers = cursoJavaScript.developersFiltra(developerELinguas, "JavaScript");
        List<String> cUsers = cursoC.developersFiltra(developerELinguas, "C");

        List<Developer> developers = new ArrayList<>();
        developers.addAll(Arrays.asList(dev1, dev2, dev3, dev4));

        cursoJava.encontraDeveloper(developers, javaUsers);
        cursoJavaScript.encontraDeveloper(developers, javaScriptUsers);
        cursoC.encontraDeveloper(developers, cUsers);

        System.out.println("----\tO Curso de Java possui como configuração:\t----");
        System.out.println("\n" + cursoJava + "\n");

        System.out.println("----\tO Curso de JavaScript possui como configuração:\t----");
        System.out.println("\n" + cursoJavaScript + "\n");

        System.out.println("----\tO Curso de C possui como configuração:\t----");
        System.out.println("\n" + cursoC + "\n");
    }
}