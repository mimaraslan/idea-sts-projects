package com.mimaraslan.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PROPERTIES")
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "PROPERTY_NAME", length = 50)
    private String propertyName;

    @Column(name = "TITLE", length = 60)
    private String title;

    @Column(name = "DESCRIPTION", length = 40)
    private String description;

    @Column(name = "TYPE", length = 80)
    private String type;

    private BigDecimal price;
    private int bedrooms;
    private int bathrooms;
    private float area;
    private String location;

    //    m                1
    // Property <<<<<---- Agent
    @ManyToOne
    @JoinColumn(name = "agent_id")
    private Agent agent;

    //    m                1
    // Property <<<<<---- Seller
    @ManyToOne
    @JoinColumn(name = "seller_id")
    private Seller seller;

    // Birden evi birden fazla kişi alabilir mi?
    // Properies   <<<<---- Buyers
    @ManyToMany
    @JoinTable(name = "property_buyer",
         joinColumns = @JoinColumn (name = "property_id"),
         inverseJoinColumns =  @JoinColumn (name = "buyer_id")
    )
    private Set<Buyer> buyers = new HashSet<>();

}
