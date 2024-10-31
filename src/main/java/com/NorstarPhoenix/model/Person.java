package com.NorstarPhoenix.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int personId;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

    public Person() {}

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Getters and setters...
}