package com.mimaraslan.model;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "CUSTOMER")
public class Customer {

    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    @Fetch(FetchMode.SELECT)
    private Set<Orders> orders = new HashSet<>(10);

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CUSTOMER_ID", nullable = false)
    private int id;

    @Column(name = "TITLE", length = 30)
    private String title;

    @Column(name = "FIRST_NAME", length = 50)
    private String firstName;

    @Column(name = "LAST_NAME", length = 60)
    private String lastName;


    public Customer() {
    }

    public Customer(Set<Orders> orders, String title, String firstName, String lastName) {
        this.orders = orders;
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Set<Orders> getOrder() {
        return orders;
    }

    public void setOrder(Set<Orders> orders) {
        this.orders = orders;
    }
}