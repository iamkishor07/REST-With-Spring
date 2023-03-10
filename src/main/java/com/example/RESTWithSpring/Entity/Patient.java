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
@Table(name = "Patient")
public class Patient {
    @Id
    @Column(name = "Pat_id") private int Pat_id; //Primary Key
    @Column(name = "PName") private String PName;
    @Column(name = "PAddress") private  String PAddress;
    @Column(name = "PDiagnosis") private  String PDiagnosis;
    @Column(name = "Record_id") private String Record_id; //Foreign key references to Record-id of Medical Record table
    @Column(name = "Hosp_id") private String Hosp_id; //Foreign key references to Hosp-id of Hospital table

}
