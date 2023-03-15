package com.example.profileservice.controller;

import com.example.cloud.commons.model.Customer;
import com.example.profileservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/services")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/save")
    @PreAuthorize("hasAuthority('create_profile')")
    public Customer save(@RequestBody Customer customer)
    {
       return customerService.save(customer);
    }

    @GetMapping("/findAll")
    @PreAuthorize("hasRole('ROLE_operator')")
    public List<Customer> findAll()
    {
        return customerService.findAll();
    }

}
