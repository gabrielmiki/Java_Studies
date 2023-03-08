package com.bankapp;

import com.bankapp.cliente.PessoaFisica;
import com.bankapp.cliente.PessoaJuridica;

public class AppBank {

    public static void main(String[] args) {

        PessoaFisica pessoaFisica = new PessoaFisica();
        PessoaJuridica pessoaJuridica = new PessoaJuridica();

        pessoaFisica.set_cpf("123456789098");
        pessoaFisica.setNomeConta("Joao Cabral");
        pessoaFisica.setSaldo(1000);

        pessoaFisica.getsaldo();
        pessoaFisica.sacar(500);
        pessoaFisica.getsaldo();

        pessoaFisica.getsaldo();
        pessoaFisica.depositar(500);
        pessoaFisica.getsaldo();

        pessoaJuridica.set_cnpj("123456789098");
        pessoaJuridica.setNomeConta("Tintas LTDA");
        pessoaJuridica.setSaldo(10000);

        pessoaJuridica.getsaldo();
        pessoaJuridica.sacar(5000);
        pessoaJuridica.getsaldo();

        pessoaJuridica.getsaldo();
        pessoaJuridica.depositar(6000);
        pessoaJuridica.getsaldo();

        pessoaJuridica.investir(10500);
        pessoaJuridica.investir(10000);
    }
}