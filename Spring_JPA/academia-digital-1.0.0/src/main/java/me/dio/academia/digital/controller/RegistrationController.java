package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.Registration;
import me.dio.academia.digital.entity.form.RegistrationForm;
import me.dio.academia.digital.service.impl.RegistrationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/registrations")
public class RegistrationController {

    @Autowired
    private RegistrationServiceImpl service;

    @PostMapping
    public Registration create(@Valid @RequestBody RegistrationForm form) { return service.create(form); }

    @GetMapping
    public List<Registration> getAll(@RequestParam(value = "neighborhood", required = false) String neighborhood) {

        return service.getAll(neighborhood); }

}
