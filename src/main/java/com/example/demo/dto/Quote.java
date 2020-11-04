package com.example.demo.dto;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @Classname Quote
 * @Description TODO
 * @Author liaojp
 * @Date 2020/11/4 18:16
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
    private String type;
    private Value value;
}
