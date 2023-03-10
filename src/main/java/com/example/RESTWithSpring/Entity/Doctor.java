package com.example.RESTWithSpring.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Doctor")
public class Doctor{
    @Id
    @Column(name = "Doc_id") private int Doc_id; //Primary Key
    @Column(name = "DName") private String DName;
    @Column(name = "Qualification") private String Qualification;
    @Column(name = "Salary") private String Salary;
    @Column(name = "Hosp_id") private  String Hosp_id; //Foreign key references to Hosp-id of Hospital table

}
