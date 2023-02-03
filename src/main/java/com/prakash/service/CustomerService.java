package com.prakash.service;

import com.prakash.entity.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> getCustomers();
    public void saveCustomer(Customer customer);
}
