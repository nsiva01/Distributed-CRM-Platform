package com.siva.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siva.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}