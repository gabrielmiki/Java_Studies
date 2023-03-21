package edu.miki.setimasemana;

public class ListaEncadeada<T> {
    
    No<T> referenciaEntrada;

    public ListaEncadeada() {
        this.referenciaEntrada = null;
    }

    public boolean isEmpty() {
        if (this.referenciaEntrada == null) {
            return true;
        }
        else {
            return false;
        }
    }

    public int size() {
        int tamanhoLista = 0;
        No<T> referenciaAux = this.referenciaEntrada;

        while (true) {
            if (referenciaAux != null) {
                tamanhoLista++;
                if (referenciaAux.getProximoNo() != null) {
                    referenciaAux = referenciaAux.getProximoNo();
                }
                else {
                    break;
                }
            }
            else {
                break;
            }
        }

        return tamanhoLista;
    }

    public void add(T novoConteudo) {
        No<T> novoNo = new No<>(novoConteudo);
        if (this.isEmpty()) {
            this.referenciaEntrada = novoNo;
        }
        else {
            No<T> noAuxiliar = this.referenciaEntrada;
            for (int i = 0; i < this.size() - 1; i++) {
                noAuxiliar = noAuxiliar.getProximoNo();
            }

            noAuxiliar.setProximoNo(novoNo);
        }
    }

    private No<T> getNo(int index) {

        validaIndice(index);

        No<T> noAuxiliar = this.referenciaEntrada;
        No<T> noRetorno = null;

        for (int i = 0; i <= index; i++) {
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        return noRetorno;
    } 

    private void validaIndice(int index) {
        if (index > this.size()) {
            throw new 
                IndexOutOfBoundsException("Não existe conteúdo no ídice informado!");
        }
    }

    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    public T remove(int index) {

        No<T> noDelete = this.getNo(index);

        if (index == 0) {
            this.referenciaEntrada = noDelete.getProximoNo();
            return noDelete.getConteudo();
        }
        else {
            No<T> noAnterior = this.getNo(index - 1);
            noAnterior.setProximoNo(noDelete.getProximoNo());
            return noDelete.getConteudo();
        }    
    }

    @Override
    public String toString() {

        String strRetorno = "";
        No<T> noAuxiliar = this.referenciaEntrada;

        for (int i = 0; i <= this.size() - 1; i++) {
            strRetorno += "No{consteúdo=" + noAuxiliar.getConteudo() + "} ---> ";
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        strRetorno += null;

        return strRetorno;
    }

}
