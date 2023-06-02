package org.miki.mocks;

import java.time.LocalDate;

public class CadastrarPessoa {

    private ApiDosCorreios apiDosCorreios;

    public CadastrarPessoa(final ApiDosCorreios apiDosCorreios) {
        this.apiDosCorreios = apiDosCorreios;
    }

    public Pessoa cadastrarPessoa(String nome, LocalDate nascimeto, String documento, String cep) {

        Pessoa pessoa = new Pessoa(nome, documento, nascimeto);

        DadosLocalizacao dadosLocalizacao = apiDosCorreios.buscaNosDadosCep(cep);

        pessoa.adicionarDadosDeEndereco(dadosLocalizacao);

        return pessoa;

    }
}
