package com.bankapp.conta;

public class ContaEmpresa extends Conta {

    public void invest(int valor) {
        if (this._saldo >= (1.1 * valor)) {
            this._saldo -= valor;
            System.out.println("\nInvestimento feito com sucesso!\n" + 
                "Valor em saldo: " + this._saldo + "\n");
        }
        else {
            System.out.println("\nSaldo Insuficiente!\n");
        }
    }
    
}
