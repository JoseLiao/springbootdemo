package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Classname Greeting
 * @Description TODO
 * @Author liaojp
 * @Date 2020/11/4 17:14
 */
@Getter
@AllArgsConstructor
public class Greeting {
    private final long id;
    private final String name;
}
