package com.example.RESTWithSpring.Repositry;

import com.example.RESTWithSpring.Entity.MedicalRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalRecordRepositry extends JpaRepository<MedicalRecord,Integer> {
}
