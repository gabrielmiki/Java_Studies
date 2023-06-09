package me.dio.academia.digital.service.impl;

import me.dio.academia.digital.entity.PhysicalAssessment;
import me.dio.academia.digital.entity.Student;
import me.dio.academia.digital.entity.form.StudentForm;
import me.dio.academia.digital.entity.form.StudentUpdateForm;
import me.dio.academia.digital.infra.utils.JavaTimeUtils;
import me.dio.academia.digital.repository.StudentRepository;
import me.dio.academia.digital.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository repository;

    @Override
    public Student create(StudentForm form) {

        Student student = new Student();
        student.setName(form.getName());
        student.setCpf(form.getCpf());
        student.setNeighborhood(form.getNeighborhood());
        student.setDateOfBirth(form.getDateOfBirth());

        return repository.save(student);

    }

    @Override
    public Student get(Long id) {
        return null;
    }

    @Override
    public List<Student> getAll(String dateOfBirth) {

        if (dateOfBirth == null) {
            return repository.findAll();
        }
        else {
            LocalDate localDate = LocalDate.parse(dateOfBirth, JavaTimeUtils.LOCAL_DATE_FORMATTER);
            repository.findByDateOfBirth(localDate);
        }

        return repository.findAll();

    }

    @Override
    public Student update(Long id, StudentUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<PhysicalAssessment> getAllPhysicalAssessments(Long id) {

        Student student = repository.findById(id).get();

        return student.getAssessments();

    }

}
