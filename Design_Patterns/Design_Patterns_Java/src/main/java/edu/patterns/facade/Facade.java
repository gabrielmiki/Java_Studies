package edu.patterns.facade;

import edu.patterns.facade.subsystems.CepApi;
import edu.patterns.facade.subsystems.CrmService;

public class Facade {

    public void migrateClient(String name, String cep) {

        String city = CepApi.getInstance().recoverCity(cep);
        String state = CepApi.getInstance().recoverState(cep);

        CrmService.saveClient(name, cep, state, city);

    }

}
