package com.springboot.trials.jpa2.service;

import com.springboot.trials.jpa2.model.Customer;
import com.springboot.trials.jpa2.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> findAllCustomers(){
        return customerRepository.findAll();
    }

    public List<Customer> findAllCustomersByFirstName(String firstName){
        return customerRepository.findAllByName_FirstName(firstName);
    }

    public void addNewCustomer(Customer customer){
        customerRepository.save(customer);
    }

    public List<Customer> findAllCustomersByStreetNumber(int streetNumber){
        return customerRepository.findAllByAddress_Street_StreetNumber(streetNumber);
    }
}
