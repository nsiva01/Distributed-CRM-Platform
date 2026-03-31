package com.siva.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siva.entity.Order;
import com.siva.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService service;

    @GetMapping("/fetch/{id}")
    public Order getOrder(@PathVariable int id) {
        return service.getOrderById(id);
    }
    
       @PostMapping("/saveOrder")
    public Order addOrder(@RequestBody Order order) {   
        return service.saveOrder(order);
    }
}