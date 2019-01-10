package com.springboot.trials.jpa2.repository;

import com.springboot.trials.jpa2.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    List<Customer> findAllByName_FirstName(String firstName);
    List<Customer> findAllByAddress_Street_StreetNumber(int number);
}
