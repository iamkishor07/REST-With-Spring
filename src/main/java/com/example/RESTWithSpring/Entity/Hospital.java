package com.example.RESTWithSpring.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hospital {
    private  int Hosp_id; //Primary Key
    private String HCity;
    private  String HAddress;
    private String Hos_Name;
    private String Pat_id; //Foreign key references to Pat-id of Patient table
    private String Doc_id; //Foreign key references to Doc-id of Doctor table

}
