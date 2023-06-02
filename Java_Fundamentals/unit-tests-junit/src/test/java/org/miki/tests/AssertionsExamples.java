package org.miki.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class AssertionsExamples {

    @Test
    void validarLancamento() {

        int[] primeiroLancamento = {10, 20, 30, 40};
        int[] segundoLancamento = {10, 20, 30, 40};

        Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);

    }

    @Test
    void validarSeObjetoEstaNulo() {

        Pessoa pessoa = null;

        Assertions.assertNull(pessoa);

        pessoa = new Pessoa("Luciano",
                LocalDateTime.of(2000, 1, 1, 15, 0));

        Assertions.assertNotNull(pessoa);

    }

    @Test
    void validarNumeroDeTiposDiferentes() {

    }
}
