package com.example.demo.payroll;

/**
 * @Classname EmployeeNotFoundException
 * @Description TODO
 * @Author liaojp
 * @Date 2020/11/5 10:09
 */
public class EmployeeNotFoundException extends RuntimeException{
    public EmployeeNotFoundException(Long id) {
        super("Cloud not fin Employee " + id);
    }
}
