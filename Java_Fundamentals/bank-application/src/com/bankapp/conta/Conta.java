package com.bankapp.conta;

public class Conta {
    
    protected int _saldo = 0;

    public int getSaldo() {
        return _saldo;
    }

    public void setSaldo(int saldo) {
        this._saldo = saldo;
    }
    
    public void sacar(int valor) {
        if (this._saldo >= valor) {
            this._saldo -= valor;
            System.out.println("\nSaque realizado com sucesso!\n" +
                "Valor corrente no saldo: " + this._saldo + "\n");
        }
        else {
            System.out.println("\nO valor requerido supera o valor em saldo.\n");
        }
    }

    public void depositar(int valor) {
        this._saldo += valor;
    }
}
