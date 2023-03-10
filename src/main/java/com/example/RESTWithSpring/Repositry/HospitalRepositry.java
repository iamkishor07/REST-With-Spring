package com.example.RESTWithSpring.Repositry;

import com.example.RESTWithSpring.Entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepositry extends JpaRepository<Hospital,Integer> {
}
