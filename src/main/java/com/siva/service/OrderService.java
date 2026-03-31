package com.siva.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siva.entity.Order;
import com.siva.repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repo;

    public Order getOrderById(int id) {
        return repo.findById(id)
                   .orElseThrow(() -> new RuntimeException("Order not found"));
    }

    public Order saveOrder(Order order) {
    	return repo.save(order);
    }
	
}