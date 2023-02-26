package edu.miki.primeirasemana.primeiroprojeto;

public class SmartTV {
    boolean ligada = false;
    int volume = 25;
    int canal = 1;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void diminuirVolume() {
        volume --;
    }

    public void aumentarVolume() {
        volume ++;
    }

    public void mudarCanal(int canalDif) {
        canal = canalDif;
    }

    public void aumentarCanal() {
        canal ++;
    }

    public void diminuirCanal() {
        canal --;
    }
}
