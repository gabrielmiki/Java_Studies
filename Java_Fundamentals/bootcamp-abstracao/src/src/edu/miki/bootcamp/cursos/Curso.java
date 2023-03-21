package edu.miki.bootcamp.cursos;

import edu.miki.bootcamp.conteudos.Conteudo;
import edu.miki.bootcamp.dev.Developer;

import java.util.*;
import java.util.stream.Collectors;

public class Curso extends Conteudo {

    public Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    private String nome;
    private Integer duracao;
    private List<String> linguagensUtilizadas = new ArrayList<>();
    private Set<Developer> developers = new TreeSet<>();

    public Curso(String nome, Integer duracao, List<String> linguagensUtilizadas) {
        this.nome = nome;
        this.duracao = duracao;
        this.linguagensUtilizadas = linguagensUtilizadas;
    }

    public Curso(String nome, Integer duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public List<String> getLinguagensUtilizadas() {
        return linguagensUtilizadas;
    }

    public void setLinguagensUtilizadas(Integer numLinguas) {
        for (int i = 0; i < numLinguas; i++) {
            System.out.println("Insira a linguagem utilizada: ");
            String linguagem = scanner.next();
            this.linguagensUtilizadas.add(linguagem);
        }
    }

    public Set<Developer> getDevelopers() {
        return developers;
    }

    public void setDevelopers(Set<Developer> developers) {
        this.developers = developers;
    }

    public List<String> developersFiltra(Map<String, List<String>> developers, String linguagem) {

        List<List<String>> containsLinguagem = developers.values().stream()
                .filter(strings -> strings.contains(linguagem))
                .toList();

        Set<Map.Entry<String, List<String>>> entries = developers.entrySet();
        List<String> linguagemUsers = new ArrayList<>();

        for (List<String> contJava : containsLinguagem) {
            for (Map.Entry<String, List<String>> entry : entries) {
                if (entry.getValue().equals(contJava)) {
                    linguagemUsers.add(entry.getKey());
                }
            }
        }

        return linguagemUsers;
    }

    public void encontraDeveloper(List<Developer> devs, List<String> linguagemUsers) {

        this.developers = devs.stream()
                .filter(developer -> linguagemUsers.contains(developer.getNome()))
                .collect(Collectors.toSet());

    }
    @Override
    public void setTemaPrincipal(String temaPrincipal) {
        this.temaPrincipal = temaPrincipal;
    }

    @Override
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return
                "\nNome = " + nome + "\n" +
                "Duracao = " + duracao + "\n" +
                "Linguagens Utilizadas = " + linguagensUtilizadas + "\n" +
                "Developers = " + developers + "\n" +
                "Tema Principal = " + temaPrincipal + "\n" +
                "Descricao = " + descricao + "\n";
    }
}
