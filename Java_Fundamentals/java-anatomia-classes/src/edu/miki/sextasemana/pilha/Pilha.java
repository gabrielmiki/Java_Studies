package edu.miki.sextasemana.pilha;

public class Pilha {
    
    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }
    
    public No top() {
        return this.refNoEntradaPilha;
    }

    public void push(No novoNo) {
        No refAuxiliar = this.refNoEntradaPilha;
        this.refNoEntradaPilha = novoNo;
        this.refNoEntradaPilha.setReNo(refAuxiliar);
    }

    public No pop() {
        if (!this.isEmpty()){
            No noPopped = this.refNoEntradaPilha;
            this.refNoEntradaPilha = this.refNoEntradaPilha.getReNo();
            return noPopped;
        }

        return null;
    }

    public boolean isEmpty() {
        if (this.refNoEntradaPilha == null) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {

        String stringRetorno = "-----------------\n";
        stringRetorno += "      Pilha\n";    
        stringRetorno += "-----------------\n";

        No noAuxiliar = this.refNoEntradaPilha;

        while (true) {
            if (noAuxiliar == null) {
                break;
            }
            else {
                stringRetorno += "[No{Dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getReNo();
            }
        }

        stringRetorno += "-----------------\n";
        return stringRetorno;
    }    
}
