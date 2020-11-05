package com.example.demo.payroll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * TODO
 */
@Configuration
public class LoadDatabase {
    public static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    public CommandLineRunner initDatabase(EmployeeRepository employeeRepository, OrderRepository orderRepository) {
        return args -> {
            log.info("Preloading:-->" + employeeRepository.save(new Employee("白鬼", "李", "主管")));
            log.info("Preloading:-->" + employeeRepository.save(new Employee("夜王", "许", "老板")));

            log.info("Preloading:-->" + orderRepository.save(new Order("MacBook Pro", Status.IN_PROGRESS)));
            log.info("Preloading:-->" + orderRepository.save(new Order("Iphone 5", Status.COMPLETED)));
        };
    }
}
