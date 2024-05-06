package com.rahul.healthcare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.healthcare.entity.PatientEntity;
import com.rahul.healthcare.repository.PatientRepo;

@Service
public class PatientService {

    @Autowired
    private PatientRepo patientRepo;

    public List<PatientEntity> getDetails() {
        return patientRepo.findAll();
    }
    
}
