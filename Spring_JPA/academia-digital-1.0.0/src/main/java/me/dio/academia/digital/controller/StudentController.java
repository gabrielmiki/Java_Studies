package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.PhysicalAssessment;
import me.dio.academia.digital.entity.Student;
import me.dio.academia.digital.entity.form.StudentForm;
import me.dio.academia.digital.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentServiceImpl service;

    @GetMapping
    public List<Student> getAll(@RequestParam(value = "dateOfBirth", required = false)
                                    String dateOfBirth) {

        return service.getAll(dateOfBirth);

    }

    @PostMapping
    public Student create(@Valid @RequestBody StudentForm form) {

        return service.create(form);

    }

    @GetMapping("/assessments/{id}")
    public List<PhysicalAssessment> getAllPhysicalAssessments(@PathVariable Long id) {

        return service.getAllPhysicalAssessments(id);

    }

}
