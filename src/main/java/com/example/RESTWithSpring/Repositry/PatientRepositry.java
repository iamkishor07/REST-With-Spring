package com.example.RESTWithSpring.Repositry;

import com.example.RESTWithSpring.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepositry extends JpaRepository<Patient,Integer> {
}
