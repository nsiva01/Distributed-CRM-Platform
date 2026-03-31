package com.siva.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siva.entity.Customer;
import com.siva.repository.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repo;

    private static final Logger log = LoggerFactory.getLogger(CustomerService.class);

    public Customer addCustomer(Customer c) {
        log.info("Adding customer: {}", c.getName());
        return repo.save(c);
    }

    public List<Customer> getAllCustomers() {
        return repo.findAll();
    }

    public Customer getCustomerById(int id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Customer not found"));
    }

    public Customer updateCustomer(int id, Customer c) {
        Customer existing = getCustomerById(id);
        existing.setName(c.getName());
        existing.setEmail(c.getEmail());
        existing.setPhone(c.getPhone());
        return repo.save(existing);
    }

    public String deleteCustomer(int id) {
        repo.deleteById(id);
        return "Customer deleted successfully";
    }
}