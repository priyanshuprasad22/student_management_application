package com.example.test.crud.democrud.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="students")
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="first_name", nullable = false)
    private String firstName;

    @Column(name="last_name", nullable = false)
    private String lastName;

    @Column(name="email")
    private String email;

    public Student(){

    }

    public Student( String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
}
