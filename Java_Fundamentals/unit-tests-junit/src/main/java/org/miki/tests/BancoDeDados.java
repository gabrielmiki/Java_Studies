package org.miki.tests;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao() {

        // ... Fez Algo ...
        LOGGER.info("Iniciou Conexao");

    }

    public static void finalizarConexao() {

        // ... Fez Algo ...
        LOGGER.info("Finalizou Conexao");

    }

    public static void insereDados(Pessoa pessoa) {

        // Insere pessoa no BD
        LOGGER.info("Inseriu Dados");

    }

    public static void removeDados(Pessoa pessoa) {

        // Remove pessoa no BD
        LOGGER.info("Removeu Dados");

    }
}
