package com.prakash.controller;
// imported package is important to run application correctly
import com.prakash.dao.CustometDAO;
import com.prakash.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    // need to inject the customer dao
    @Autowired
    private CustometDAO custometDAO;
    @RequestMapping("/list")
    public String listCustomer(Model theModel) {
        // get customer list from dao
        List<Customer> theCustomers = custometDAO.getCustomers();

        // add customers with theModel
        theModel.addAttribute("customers", theCustomers);
        return "list-customers";
    }
}
