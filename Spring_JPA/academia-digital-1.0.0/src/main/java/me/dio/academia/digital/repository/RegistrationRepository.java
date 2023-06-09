package me.dio.academia.digital.repository;

import me.dio.academia.digital.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {

    List<Registration> findByStudentNeighborhood(String neighborhood);

}
