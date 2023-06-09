package me.dio.academia.digital.service.impl;

import me.dio.academia.digital.entity.Registration;
import me.dio.academia.digital.entity.form.RegistrationForm;
import me.dio.academia.digital.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.imageio.spi.RegisterableService;
import javax.imageio.spi.ServiceRegistry;
import java.util.List;

@Service
public class RegistrationServiceImpl implements RegisterableService {

    @Autowired
    private RegistrationRepository repository;

    @Override
    public void onRegistration(ServiceRegistry registry, Class<?> category) {

    }

    @Override
    public void onDeregistration(ServiceRegistry registry, Class<?> category) {

    }

    public Registration create(RegistrationForm form) {
        return null;
    }

    public List<Registration> getAll(String neighborhood) {

        if (neighborhood == null) {

            return repository.findAll();

        }
        else {

            return repository.findByStudentNeighborhood(neighborhood);

        }

    }
}
