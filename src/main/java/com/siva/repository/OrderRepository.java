package com.siva.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siva.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}