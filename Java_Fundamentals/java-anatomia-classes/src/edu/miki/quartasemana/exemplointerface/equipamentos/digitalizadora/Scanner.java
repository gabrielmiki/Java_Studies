package edu.miki.quartasemana.exemplointerface.equipamentos.digitalizadora;

public class Scanner implements Digitalizadora {

    @Override
    public void digitaliza() {
        System.out.println("Digitaliza!");
        
    }
    
}
