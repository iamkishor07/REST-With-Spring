package com.example.RESTWithSpring.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    private int Pat_id; //Primary Key
    private String PName;
    private  String PAddress;
    private  String PDiagnosis;
    private String Record_id; //Foreign key references to Record-id of Medical Record table
    private String Hosp_id; //Foreign key references to Hosp-id of Hospital table

}
