package com.springboot.trials.jpa2.controller;

import com.springboot.trials.jpa2.model.Customer;
import com.springboot.trials.jpa2.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> getAllCustomers(){
        return customerService.findAllCustomers();
    }

    @PostMapping("/customers")
    public void addNewCustomer(@RequestBody Customer customer){
        customerService.addNewCustomer(customer);
    }

    @GetMapping("/customers/firstName={firstName}")
    public List<Customer> getAllCustomersByFirstName(@PathVariable String firstName){
        return customerService.findAllCustomersByFirstName(firstName);
    }

    @GetMapping("/customers/streetNo={streetNo}")
    public List<Customer> getAllCustomersByStreetNumber(@PathVariable int streetNo){
        return customerService.findAllCustomersByStreetNumber(streetNo);
    }
}
