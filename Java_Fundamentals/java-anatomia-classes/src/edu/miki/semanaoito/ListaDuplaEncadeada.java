package edu.miki.semanaoito;

public class ListaDuplaEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista;
    
    
    public ListaDuplaEncadeada() {
        this.tamanhoLista = 0;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    public int size() {
        return this.tamanhoLista;
    }

    private NoDuplo<T> getNo(int index) {
        NoDuplo<T> noAuxiliar = this.primeiroNo;

        for (int i = 0; (i < index) && (noAuxiliar != null) ; i++) {
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        return noAuxiliar;
    }

    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    public void add(T conteudo) {

        NoDuplo<T> novoNo = new NoDuplo<>(conteudo);
        novoNo.setNoProximo(null);
        novoNo.setNoPrevio(this.ultimoNo);

        if (this.primeiroNo == null) {
            this.primeiroNo = novoNo;
        }
        if (this.ultimoNo != null) {
            this.ultimoNo = novoNo;
        }
        this.ultimoNo = novoNo;
        this.tamanhoLista++;
    }

    public void add(int index, T conteudo) {

        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(conteudo);
        novoNo.setNoProximo(noAuxiliar);

        if (novoNo.getNoProximo() != null) {
            novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
            novoNo.setNoProximo(noAuxiliar.getNoProximo());
        }
        else {
            novoNo.setNoPrevio(this.ultimoNo);
            this.ultimoNo = novoNo;
        }

        if (index == 0) {
            this.primeiroNo = novoNo;
        }
        else {
            novoNo.getNoPrevio().setNoProximo(novoNo);
        }

        this.tamanhoLista++;
    }

    public void remove(int index) {

        if (index == 0) {
            this.primeiroNo = this.primeiroNo.getNoProximo();

            if (this.primeiroNo != null) {
                this.primeiroNo.setNoPrevio(null);
            }
        }
        else {
            NoDuplo<T> noAuxiliar = this.getNo(index);
            noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());

            if (noAuxiliar != this.ultimoNo) {
                noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar);
            }
            else {
                this.ultimoNo = noAuxiliar;
            }
        }

        this.tamanhoLista--;
    }

    @Override
    public String toString() {
        
        String strRetorno = "";

        NoDuplo<T> noAuxiliar = this.primeiroNo;
        for (int i = 0; i < this.size(); i++) {
            strRetorno += "[No{conteudo" + noAuxiliar.getConteudo() + "}] ----> ";

            noAuxiliar = noAuxiliar.getNoProximo();
        }

        strRetorno += " null";
        return strRetorno;
    }
    
}
