package com.example.RESTWithSpring.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "MedicalRecord")
public class MedicalRecord {
    @Id
    @Column(name = "Record_id") private int Record_id; //Primary Key
    @Column(name = "Problem") private String Problem;
    @Column(name = "Date_of_examination") private Date Date_of_examination;
    @Column(name = "Pat_id") private int Pat_id; //Foreign key references to Pat-id of Patient table

}
