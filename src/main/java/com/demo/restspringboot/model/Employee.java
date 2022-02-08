package com.demo.restspringboot.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "employees")
@Entity
public class Employee {
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "fist_name",nullable = false)
    private  String firstName;

    @Column(name = "last_name",nullable = false)
    private String lastName;

    @Column(name = "email",nullable = true)
    private  String email;

}
