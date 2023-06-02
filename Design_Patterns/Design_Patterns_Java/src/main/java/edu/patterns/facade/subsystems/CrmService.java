package edu.patterns.facade.subsystems;

public class CrmService {

    private CrmService() {

        super();

    }

    public static void saveClient(String name, String cep,
                                  String state, String city) {

        System.out.println("Client saved in the CRM system!");

    }

}
