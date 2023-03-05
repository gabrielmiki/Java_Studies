package edu.miki.quartasemana.IPhonePoo.Home.AppInterface.Apps;

import edu.miki.quartasemana.IPhonePoo.Home.AppInterface.AppInterface;
import edu.miki.quartasemana.IPhonePoo.Services.CaixasSom;
import edu.miki.quartasemana.IPhonePoo.Services.Microfone;

public class AparelhoTelefonico implements AppInterface{

    Microfone microfone = new Microfone();
    CaixasSom caixasSom = new CaixasSom();

    @Override
    public void criaPlanoDeFundo() {
        // Implementa aparência
    }

    @Override
    public void criaComponentes() {
        // Implementa botão para ligar, atender e
        // iniciarCorreioDeVoz
    }

    @Override
    public void criaServicos() {
        // Implementa acoes provenientes dos
        // componentes
    }

    
}