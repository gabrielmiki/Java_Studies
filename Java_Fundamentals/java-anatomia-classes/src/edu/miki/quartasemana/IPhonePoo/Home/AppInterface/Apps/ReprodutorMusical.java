package edu.miki.quartasemana.IPhonePoo.Home.AppInterface.Apps;

import edu.miki.quartasemana.IPhonePoo.Home.AppInterface.AppInterface;
import edu.miki.quartasemana.IPhonePoo.Services.CaixasSom;

public class ReprodutorMusical implements AppInterface {

    CaixasSom caixasSom = new CaixasSom();

    @Override
    public void criaPlanoDeFundo() {
        // Implementa aparência
    }

    @Override
    public void criaComponentes() {
        // Implementa botão play, pause e as
        // opções de seleção de musica
    }

    @Override
    public void criaServicos() {
        // Implementa acoes provenientes dos
        // componentes
    }
    
}
