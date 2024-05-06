package com.rahul.healthcare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.healthcare.entity.PatientEntity;
import com.rahul.healthcare.service.PatientService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @GetMapping("/details")
    public List<PatientEntity> getDetails() {
        return patientService.getDetails();
    }
    
}
