package com.example.demo.dto;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @Classname Value
 * @Description TODO
 * @Author liaojp
 * @Date 2020/11/4 18:17
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {
    private Long id;
    private String quote;
}
