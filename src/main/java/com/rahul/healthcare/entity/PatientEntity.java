package com.rahul.healthcare.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="patient")
public class PatientEntity {
    @Id
    private Integer id;
    private String name;
    private Integer age;
    private String blood;
}
