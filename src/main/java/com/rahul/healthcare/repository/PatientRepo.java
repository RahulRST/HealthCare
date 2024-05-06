package com.rahul.healthcare.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.healthcare.entity.PatientEntity;

public interface PatientRepo extends JpaRepository<PatientEntity,Integer> {
    
}
