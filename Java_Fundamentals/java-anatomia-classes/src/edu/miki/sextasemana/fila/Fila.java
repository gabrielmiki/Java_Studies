package edu.miki.sextasemana.fila;

public class Fila<T> {
    
    private No<T> refNoEntradaFila;

    public Fila() {
    }

    public Fila(No<T> refNoEntradaFila) {
        this.refNoEntradaFila = null;
    }

    public void enqueue(T obj) {
        No<T> novoNo = new No<>(obj);
        novoNo.setRefNo(this.refNoEntradaFila);
        this.refNoEntradaFila = novoNo;
    }

    public T firstNo() {
        if (!this.isEmpty()) {
            No<T> primeiroNo = this.refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    primeiroNo = primeiroNo.getRefNo();
                }
                else {
                    break;
                }
            }
            return primeiroNo.getObject();
        }
        return null;
    }

    public T dequeue() {
        if (!this.isEmpty()) {
            No<T> primeiroNo = this.refNoEntradaFila;
            No<T> auxiliarNo = this.refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    auxiliarNo = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }
                else {
                    auxiliarNo.setRefNo(null);
                    break;
                }
            }
            return primeiroNo.getObject();
        }
        return null;
    }

    public boolean isEmpty() {
        if (this.refNoEntradaFila == null) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        String stringRetorno = "";

        No<T> auxiliNo = this.refNoEntradaFila;

        if (this.refNoEntradaFila != null) {
            while (true) {
                stringRetorno += " [No{objeto=" + auxiliNo.getObject() + "}] --->";
                auxiliNo = auxiliNo.getRefNo();
                if (auxiliNo.getRefNo() != null) {
                    auxiliNo = auxiliNo.getRefNo();
                }
                else {
                    stringRetorno += " null";
                    break;
                }
            }

        }
        else {
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}
