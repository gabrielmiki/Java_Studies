package edu.patterns.demo.controller;

import edu.patterns.demo.model.Client;
import edu.patterns.demo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("clients")
public class ClientRestController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public ResponseEntity<Iterable<Client>> searchAll() {

        return ResponseEntity.ok(clientService.searchAll());

    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> searchById(Long id) {

        return ResponseEntity.ok(clientService.searchById(id));

    }

    @PostMapping
    public ResponseEntity<Client> insert(@RequestBody Client client) {

        clientService.insert(client);
        return ResponseEntity.ok(client);

    }

    @PutMapping("/{id}")
    public ResponseEntity<Client> update(@PathVariable Long id, @RequestBody Client client) {

        clientService.update(id, client);
        return ResponseEntity.ok(client);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Client> delete(@PathVariable Long id) {

        clientService.delete(id);
        return ResponseEntity.ok().build();

    }
}
