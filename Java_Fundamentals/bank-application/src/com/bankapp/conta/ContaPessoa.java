package com.bankapp.conta;

public class ContaPessoa extends Conta {
    
    public void invest(int valor) {
        if (this._saldo >= valor) {
            System.out.println("\nInvestimento feito com sucesso!\n" + 
                "Valor em saldo: " + this._saldo + "\n");
        }
    }
}
