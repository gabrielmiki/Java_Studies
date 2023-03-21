package edu.miki.decimasemana;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapCarro {
    
    public static void main(String[] args) {
        Map<String, String> aluno = new HashMap<>();

        aluno.put("nome", "Joao");
        aluno.put("idade", "17");
        aluno.put("Media", "8.5");
        aluno.put("Turma", "Ja");

        System.out.println(aluno);

        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        List<Map<String, String>> listaAlunos = new ArrayList<>();

        listaAlunos.add(aluno);

        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("nome", "Maria");
        aluno2.put("idade", "15");
        aluno2.put("Media", "9.5");
        aluno2.put("Turma", "Ta");

        listaAlunos.add(aluno2);

        System.out.println(listaAlunos);

        System.out.println(aluno.containsKey("nome"));
    }
}
