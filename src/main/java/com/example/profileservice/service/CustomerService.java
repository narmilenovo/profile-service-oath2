package com.example.profileservice.service;

import com.example.cloud.commons.model.Customer;

import java.util.List;

public interface CustomerService {
    Customer save(Customer customer);

    List<Customer> findAll();
}
