package com.prakash.dao;

import com.prakash.entity.Customer;

import java.util.List;

public interface CustometDAO {
    public List<Customer> getCustomers();
    public void saveCustomer(Customer customer);

    Customer getCustomer(int theId);

    void deleteCustomer(int theId);
}
