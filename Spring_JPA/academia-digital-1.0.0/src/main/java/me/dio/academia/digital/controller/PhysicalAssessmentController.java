package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.PhysicalAssessment;
import me.dio.academia.digital.entity.form.PhysicalAssessmentForm;
import me.dio.academia.digital.service.impl.PhysicalAssessmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assessments")
public class PhysicalAssessmentController {

    @Autowired
    private PhysicalAssessmentServiceImpl service;

    @PostMapping
    public PhysicalAssessment create(@RequestBody PhysicalAssessmentForm form) {

        return service.create(form);

    }

}
