package edu.miki.set;

public class LinguagemFavorita implements Comparable<LinguagemFavorita> {
    
    private String nome;
    private Integer anoCriacao;
    private String ide;

    public LinguagemFavorita(String nome, Integer anoCriacao, String ide) {
        this.nome = nome;
        this.anoCriacao = anoCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(Integer anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    @Override
    public String toString() {
        return "LinguagemFavorita [nome=" + nome + ", anoCriacao=" + anoCriacao + ", ide=" + ide + "]";
    }

    @Override
    public int compareTo(LinguagemFavorita o) {
        return this.getNome().compareToIgnoreCase(o.getNome());
    }
    
    
}
