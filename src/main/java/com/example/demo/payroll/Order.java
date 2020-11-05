package com.example.demo.payroll;

import java.io.IOException;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @Classname Order
 * @Description TODO
 * @Author liaojp
 * @Date 2020/11/5 14:34
 */
@Data
@Entity
@Table(name = "CUSTOMER_ORDER")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUSTOMER_ORDER_SEQ")
    private Long id;

    private String description;
    private Status status;

    public Order() {

    }

    public Order(String description, Status status) {
        this.description = description;
        this.status = status;
    }
}
