package com.prakash.dao;

import com.prakash.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class CustomerDAPImpl implements CustometDAO{
    @Autowired
    private SessionFactory sessionFactory;
    @Override
//    @Transactional // I remove this from here and add it to Customer service
    public List<Customer> getCustomers() {
        // get current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // create query
        Query<Customer> theQuery = currentSession.createQuery("from Customer order by firstName", Customer.class);

        // execute query and get result list
        List<Customer> customers = theQuery.getResultList();
        // return the results
        return customers;
    }

    @Override
    public void saveCustomer(Customer customer) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.save(customer);
    }
}
