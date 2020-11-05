package com.example.demo.payroll;

/**
 * @Classname OrderNotFountException
 * @Description
 * @Author liaojp
 * @Date 2020/11/5 15:03
 */
public class OrderNotFountException extends RuntimeException {
    public OrderNotFountException(Long id) {
        super("Cloud not found order " + id);
    }
}
