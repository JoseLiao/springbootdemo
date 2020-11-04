package com.example.demo.controller;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.Greeting;

/**
 * @Classname RestTestController
 * @Description TODO
 * @Author liaojp
 * @Date 2020/11/4 16:55
 */
@RestController
public class RestTestController {
    public static final Logger log = LoggerFactory.getLogger(RestTestController.class);

    private final AtomicLong counter = new AtomicLong();

    private static final String TEMPLATE = "Hello, %s!";

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "world") String name) {
        return String.format(TEMPLATE, name);
    }

    /**
     * 那具体是怎么将对象转为json的呢
     * The Greeting object must be converted to JSON. Thanks to Spring’s HTTP message converter support, you need not do this conversion manually. Because Jackson 2 is on the classpath, Spring’s MappingJackson2HttpMessageConverter is automatically chosen to convert the Greeting instance to JSON.
     * @param name
     * @return
     */
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "world") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(TEMPLATE, name));
    }

    @PostMapping("/greetingPost")
    public Greeting greeting(@RequestBody Greeting greeting) {
        log.info(greeting.toString());
        return greeting;
    }

    /**
     * 可设置属性，还有编码之类的
     * @param name
     * @return
     */
    @RequestMapping(value = "/greetingRequest", method = RequestMethod.POST, consumes = "text/plain")
    public Greeting greetingRequest(@RequestBody String name) {
        log.info(name);
        return new Greeting(1L, "33");
    }

}
