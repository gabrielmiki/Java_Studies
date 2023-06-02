package org.miki.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

public class PessoaTest {

    @Test
    void deveCalcularIdade() {

        Pessoa pessoa = new Pessoa("Jassica",
                LocalDateTime.of(2000, 1, 1, 15, 0));

        Assertions.assertEquals(23, pessoa.getIdade());

    }

    @Test
    void deveRetornarSeEMaiorDeIdade() {

        Pessoa pessoa = new Pessoa("Jassica",
                LocalDateTime.of(2000, 1, 1, 15, 0));

        Assertions.assertTrue(pessoa.ehMaiorDeIdade());

        Pessoa pessoa2 = new Pessoa("Joao",
                LocalDateTime.now());

        Assertions.assertFalse(pessoa2.ehMaiorDeIdade());

    }

}
