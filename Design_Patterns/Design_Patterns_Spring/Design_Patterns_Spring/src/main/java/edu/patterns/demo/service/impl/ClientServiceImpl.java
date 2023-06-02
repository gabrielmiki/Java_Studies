package edu.patterns.demo.service.impl;

import edu.patterns.demo.model.Address;
import edu.patterns.demo.model.AddressRepository;
import edu.patterns.demo.model.Client;
import edu.patterns.demo.model.ClientRepository;
import edu.patterns.demo.service.ClientService;
import edu.patterns.demo.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<Client> searchAll() {

        return clientRepository.findAll();

    }

    @Override
    public Client searchById(Long id) {

        Optional<Client> client = clientRepository.findById(id);
        return client.get();

    }

    @Override
    public void insert(Client client) {

        saveClientWithCep(client);

    }

    @Override
    public void update(Long id, Client client) {

        Optional<Client> clientDb = clientRepository.findById(id);
        if (clientDb.isPresent()) {

            saveClientWithCep(client);

        }
    }

    @Override
    public void delete(Long id) {

        clientRepository.deleteById(id);

    }

    private void saveClientWithCep(Client client) {

        String cep = client.getAddress().getCep();
        Address address = addressRepository.findById(cep).orElseGet(() -> {

            Address newAddress = viaCepService.verifyCep(cep);
            addressRepository.save(newAddress);
            return newAddress;

        });

        client.setAddress(address);

        clientRepository.save(client);

    }
}
