package me.dio.academia.digital.repository;

import me.dio.academia.digital.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByDateOfBirth(LocalDate dateOfBirth);

}
