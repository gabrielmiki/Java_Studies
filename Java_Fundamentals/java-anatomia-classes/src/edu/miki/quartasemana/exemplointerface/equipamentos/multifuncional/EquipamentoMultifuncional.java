package edu.miki.quartasemana.exemplointerface.equipamentos.multifuncional;

import edu.miki.quartasemana.exemplointerface.equipamentos.copiadora.Copiadora;
import edu.miki.quartasemana.exemplointerface.equipamentos.digitalizadora.Digitalizadora;
import edu.miki.quartasemana.exemplointerface.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Digitalizadora, Copiadora, Impressora {

    @Override
    public void digitaliza() {
        System.out.println("Multifuncional Digitaliza!");
        
    }

    @Override
    public void Copiar() {
        System.out.println("Multifuncional Copia!");
        
    }

    @Override
    public void imprime() {
        System.out.println("Multifuncional Imprime!");
        
    }
    
}
