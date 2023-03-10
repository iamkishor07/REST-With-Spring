package com.example.RESTWithSpring.Repositry;

import com.example.RESTWithSpring.Entity.MedicalRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalRecordRepositry extends JpaRepository<MedicalRecord,Integer> {
}
