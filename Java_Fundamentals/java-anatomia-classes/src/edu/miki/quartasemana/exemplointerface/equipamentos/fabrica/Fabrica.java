package edu.miki.quartasemana.exemplointerface.equipamentos.fabrica;

import edu.miki.quartasemana.exemplointerface.equipamentos.copiadora.Copiadora;
import edu.miki.quartasemana.exemplointerface.equipamentos.impressora.Impressora;
import edu.miki.quartasemana.exemplointerface.equipamentos.multifuncional.EquipamentoMultifuncional;
import edu.miki.quartasemana.exemplointerface.equipamentos.digitalizadora.Digitalizadora;

public class Fabrica {
    public static void main(String[] args) {
        Impressora eqMultifuncional1 = new EquipamentoMultifuncional();
        Digitalizadora eqMultifuncional2 = new EquipamentoMultifuncional();
        Copiadora eqMultifuncional3 = new EquipamentoMultifuncional();

        System.out.println("Os equipamentos multifuncionais podem ser identados a partir das interfaces!");
        eqMultifuncional1.imprime();
        eqMultifuncional2.digitaliza();
        eqMultifuncional3.Copiar();

        EquipamentoMultifuncional equipamentoMultifuncional4 = new EquipamentoMultifuncional();
        equipamentoMultifuncional4.Copiar();
        equipamentoMultifuncional4.imprime();
        equipamentoMultifuncional4.digitaliza();
    }
}
