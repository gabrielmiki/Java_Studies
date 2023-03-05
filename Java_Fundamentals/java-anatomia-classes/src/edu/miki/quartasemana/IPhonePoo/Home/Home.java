package edu.miki.quartasemana.IPhonePoo.Home;

import edu.miki.quartasemana.IPhonePoo.Home.AppInterface.Apps.AparelhoTelefonico;
import edu.miki.quartasemana.IPhonePoo.Home.AppInterface.Apps.Navegador;
import edu.miki.quartasemana.IPhonePoo.Home.AppInterface.Apps.ReprodutorMusical;

public class Home {
    
    Navegador navegador = new Navegador();
    ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
    AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();

    public void setApp() {};
}
