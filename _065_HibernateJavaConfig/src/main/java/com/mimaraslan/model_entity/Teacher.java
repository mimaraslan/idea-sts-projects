package com.mimaraslan.model_entity;

import jakarta.persistence.*;

@Entity
@Table(name = "TEACHER")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column (name = "TEACHER_ID")
    private String id;
    
    private String firstname;
}
