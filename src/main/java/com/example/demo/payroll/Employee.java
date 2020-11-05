package com.example.demo.payroll;

import lombok.Data;
import lombok.Generated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 员工实体类
 */
@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue
    private Long id;
    //private String name;
    private String role;

    private String lastName;
    private String firstName;

    public Employee() {

    }

    public Employee(String lastName, String firstName, String role) {
        //this.name = name;
        this.lastName = lastName;
        this.firstName = firstName;
        this.role = role;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public void setName(String name) {
        String[] s = name.split(" ");
        this.firstName = s[0];
        this.lastName = s[1];
    }
}
