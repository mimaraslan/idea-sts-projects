package com.mimaraslan.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "CUSTOMER")
public class Customer {

    @Id // Id değeri verir. Primary Key (PK)
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column (name = "ID", nullable = false)
    private int id;

    @Basic // bu kolon tabloda mutlaka olacak
    @Column(name = "FIRST_NAME" , length = 40 , nullable = false)
    private String firstname;

    @Transient // Bu alani kolun sutun bunu gormezden gel.
    @Column(name = "LAST_NAME" , length = 60)
    private String lastname;

    @Embedded
    private Address address;  // sehir - ilce - mahalle


    @Temporal(TemporalType.DATE) // Sadece Tarih verisini formatladik.
    @Column(name = "CREATION_DATE")
    private Date creationDate;


    public Customer() {
    }

    public Customer(int id, String firstname, String lastname, Address address, Date creationDate) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.creationDate = creationDate;
    }

    public Customer(String firstname, String lastname, Address address, Date creationDate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.creationDate = creationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
