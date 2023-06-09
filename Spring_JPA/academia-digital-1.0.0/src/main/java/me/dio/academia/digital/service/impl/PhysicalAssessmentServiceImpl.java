package me.dio.academia.digital.service.impl;

import me.dio.academia.digital.entity.PhysicalAssessment;
import me.dio.academia.digital.entity.Student;
import me.dio.academia.digital.entity.form.PhysicalAssessmentForm;
import me.dio.academia.digital.entity.form.PhysicalAssessmentUpdateForm;
import me.dio.academia.digital.repository.PhysicalAssessmentRepository;
import me.dio.academia.digital.repository.StudentRepository;
import me.dio.academia.digital.service.IPhysicalAssessmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhysicalAssessmentServiceImpl implements IPhysicalAssessmentService {

    @Autowired
    private PhysicalAssessmentRepository assessmentRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public PhysicalAssessment create(PhysicalAssessmentForm form) {

        PhysicalAssessment physicalAssessment = new PhysicalAssessment();
        Student student = studentRepository.findById(form.getStudentId()).get();

        physicalAssessment.setStudent(student);
        physicalAssessment.setHeight(form.getHeight());
        physicalAssessment.setWeight(form.getWeight());

        return assessmentRepository.save(physicalAssessment);

    }

    @Override
    public PhysicalAssessment get(Long id) {
        return null;
    }

    @Override
    public List<PhysicalAssessment> getAll() {

        return assessmentRepository.findAll();

    }

    @Override
    public PhysicalAssessment update(Long id, PhysicalAssessmentUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
