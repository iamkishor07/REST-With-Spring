package com.example.RESTWithSpring.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctor{
    private int Doc_id; //Primary Key
    private String DName;
    private String Qualification;
    private String Salary;
    private  String Hosp_id; //Foreign key references to Hosp-id of Hospital table

}
