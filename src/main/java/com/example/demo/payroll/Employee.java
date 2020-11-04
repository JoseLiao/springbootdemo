package com.example.demo.payroll;

import lombok.Data;
import lombok.Generated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * TODO
 */
@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String role;

    public Employee() {

    }

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }
}
