package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname RestTestController
 * @Description TODO
 * @Author liaojp
 * @Date 2020/11/4 16:55
 */
@RestController
public class RestTestController {
    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        System.out.println(name);
        return String.format("hello %s!", name);
    }
}
