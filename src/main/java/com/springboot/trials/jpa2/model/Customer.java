package com.springboot.trials.jpa2.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue
    private long customerId;

    @Embedded
    private Name name;

    @Embedded
    private Address address;

    @ElementCollection
    private List<Phone> phones;

    public Customer() {
    }

    public Customer(Long customerId, Name name, Address address) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }
}
