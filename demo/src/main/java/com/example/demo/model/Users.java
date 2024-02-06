package com.example.demo.model;

import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Users {
    @Id
    String id;
    @Column(nullable = false)
    String name;
    @Column
    int score = 0;
    @Column
    Date created = Date.valueOf(LocalDate.now());   
}
