package com.example.RESTWithSpring.Repositry;

import com.example.RESTWithSpring.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepositry extends JpaRepository<Patient,Integer> {
}
