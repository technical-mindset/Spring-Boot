package com.example.demo.Model;


import jakarta.persistence.*;

@Entity
@Table(name = "Customer")
public class Customer {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "GENDER")
    private String gender;

    public Customer(long id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public Customer() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
