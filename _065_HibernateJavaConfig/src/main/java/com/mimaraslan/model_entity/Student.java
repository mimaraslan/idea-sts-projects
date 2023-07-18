package com.mimaraslan.model_entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {
/*
    @Id
    @GeneratedValue (strategy = GenerationType.UUID)
    private String id; // 9c64ff79-c4b5-478d-b691-fd5dbed0dd41
*/

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id; // 1 2 3 4 5

    @Column(name = "FIRST_NAME")
    private String firstname;

    private String lastname;

    private String email;

    public Student() {
    }

    public Student(String firstname, String lastname, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
