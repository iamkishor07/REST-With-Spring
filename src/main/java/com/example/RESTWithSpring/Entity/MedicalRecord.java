package com.example.RESTWithSpring.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedicalRecord {
    private int Record_id; //Primary Key
    private String Problem;
    private Date Date_of_examination;
    private int Pat_id; //Foreign key references to Pat-id of Patient table

}
