package edu.miki.bootcamp.dev;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Developer {

    public Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    private String nome;
    private Integer idade;
    private List<String> linguagensFavoritas = new ArrayList<>();

    public Developer(String nome, Integer idade, List<String> linguagensFavoritas) {
        this.nome = nome;
        this.idade = idade;
        this.linguagensFavoritas = linguagensFavoritas;
    }

    public Developer(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public List<String> getLinguagensFavoritas() {
        return linguagensFavoritas;
    }

    public void setLinguagensFavoritas(Integer numLinguas) {
        for (int i = 0; i < numLinguas; i++) {
            System.out.println("Insira a linguagem: ");
            String linguagem = scanner.next();
            this.linguagensFavoritas.add(linguagem);
        }
    }

    @Override
    public String toString() {
        return "Developer{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", linguagensFavoritas=" + linguagensFavoritas +
                '}';
    }
}
