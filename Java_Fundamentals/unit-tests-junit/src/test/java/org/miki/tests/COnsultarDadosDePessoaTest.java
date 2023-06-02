package org.miki.tests;

import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class COnsultarDadosDePessoaTest {

    @BeforeAll
    static void configuracaoConexao() {
        BancoDeDados.iniciarConexao();
        System.out.println("Rodou ConfiguraConexao!");
    }

    @BeforeEach
    void insereDadosParaTeste() {
        BancoDeDados.insereDados(new Pessoa("Joao",
                LocalDateTime.of(2000, 1, 1, 13, 0)));
    }

    @AfterEach
    void removeDadosDoTeste() {
        BancoDeDados.removeDados(new Pessoa("Joao",
                LocalDateTime.of(2000, 1, 1, 13, 0)));
    }

    @Test
    void validarDadosDeRetorno() {
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void finalizaConexao() {
        BancoDeDados.finalizarConexao();
        System.out.println("Rodou FinalizaConexao!");
    }

}
