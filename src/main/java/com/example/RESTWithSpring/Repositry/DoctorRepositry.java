package com.example.RESTWithSpring.Repositry;

import com.example.RESTWithSpring.Entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepositry extends JpaRepository<Doctor,Integer> {
}
