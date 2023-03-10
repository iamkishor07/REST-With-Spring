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
@Table(name = "Hospital")
public class Hospital {
    @Id
    @Column(name = "Hosp_id") private  int Hosp_id; //Primary Key
    @Column(name = "HCity") private String HCity;
    @Column(name = "HAddress") private  String HAddress;
    @Column(name = "Hos_Name") private String Hos_Name;
    @Column(name = "Pat_id") private String Pat_id; //Foreign key references to Pat-id of Patient table
    @Column(name = "Doc_id") private String Doc_id; //Foreign key references to Doc-id of Doctor table

}
