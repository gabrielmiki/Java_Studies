package edu.miki.map;

public class Livros {
    
    private String nome;
    private Integer paginas;

    public Livros(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getPaginas() {
        return paginas;
    }
    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }
    @Override
    public String toString() {
        return "Livros [nome=" + nome + ", paginas=" + paginas + "]";
    }

}
