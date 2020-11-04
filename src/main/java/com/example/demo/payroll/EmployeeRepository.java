package com.example.demo.payroll;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * TODO
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
