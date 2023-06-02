package edu.patterns.facade.subsystems;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi() {

        super();

    }

    public static CepApi getInstance() {

        return instancia;

    }

    public String recoverCity(String cep) {

        return "Jaboticabal";

    }

    public String recoverState(String cep) {

        return "São Paulo";

    }


}
