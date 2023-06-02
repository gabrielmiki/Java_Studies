package org.miki.mocks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTeste {

    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    CadastrarPessoa cadastrarPessoa;
    @Test
    void validarDadosDeCadastro() {

        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("SP", "Sao Paulo",
                "Rua Chechez", "Apto 2345", "Centro");

        Mockito.when(apiDosCorreios.buscaNosDadosCep("238764")).thenReturn(dadosLocalizacao);
        Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("Gabriel", LocalDate.now(),
                "12345677", "238764");

        Assertions.assertEquals("Gabriel", pessoa.getNome());
        Assertions.assertEquals("12345677", pessoa.getDocumento());

    }
}
