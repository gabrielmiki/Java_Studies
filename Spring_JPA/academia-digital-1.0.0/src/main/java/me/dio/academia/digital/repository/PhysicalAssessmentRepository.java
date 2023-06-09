package me.dio.academia.digital.repository;

import me.dio.academia.digital.entity.PhysicalAssessment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhysicalAssessmentRepository extends JpaRepository<PhysicalAssessment, Long> {
}
