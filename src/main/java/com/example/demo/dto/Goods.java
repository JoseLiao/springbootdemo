package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

/**
 * TODO
 */
@Data
@AllArgsConstructor
public class Goods {
    private BigDecimal price;
    private String name;
    private int amount;
}
