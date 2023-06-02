package org.miki.tests;

public class TransferenciaEntreContas {

    public void transfer(int valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero!");
        }
    }
}
