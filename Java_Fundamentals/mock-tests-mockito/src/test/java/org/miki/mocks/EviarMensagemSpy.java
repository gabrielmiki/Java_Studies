package org.miki.mocks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class EviarMensagemSpy {

    @Spy
    EnviarMensagem enviarMensagem = new EnviarMensagem();

    @Test
    void adicionarMensagem() {

        Mensagem mensagem = new Mensagem("Hello World");

        enviarMensagem.adicionarMensagem(mensagem);

        verify(enviarMensagem).adicionarMensagem(mensagem);

        Assertions.assertEquals(1, enviarMensagem.getMensagens().size());
        Assertions.assertFalse(enviarMensagem.getMensagens().isEmpty());

    }

    @Test
    void verificarComportamnentoDaClasse() {

        Mockito.verifyNoInteractions(enviarMensagem);

    }

}
