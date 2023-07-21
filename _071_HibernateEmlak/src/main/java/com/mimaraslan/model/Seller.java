package com.mimaraslan.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "SELLERS")
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "FIRST_NAME", length = 50)
    private String firstName;

    @Column(name = "LAST_NAME", length = 50)
    private String lastName;

    @Column(name = "EMAIL", length = 60)
    private String email;

    @Column(name = "PHONE", length = 40)
    private String phone;

    // Bir satici, birden fazla evi satabilir mi?
    //  1             m
    //Seller ---->>>> Property
    @OneToMany(mappedBy = "seller", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Property> properties = new HashSet<>();

}
