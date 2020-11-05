package com.example.demo.payroll;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Classname OrderRepository
 * @Description 定单dao接口
 * @Author liaojp
 * @Date 2020/11/5 14:38
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
