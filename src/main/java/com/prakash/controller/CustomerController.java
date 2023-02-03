package com.prakash.controller;
// imported package is important to run application correctly
import com.prakash.dao.CustometDAO;
import com.prakash.entity.Customer;
import com.prakash.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    // need to inject the customer dao
//    @Autowired
//    private CustometDAO custometDAO;
    @Autowired
    private CustomerService customerService;
//    @RequestMapping("/list")
    @GetMapping("/list")
    public String listCustomer(Model theModel) {
        // get customer list from dao
//        List<Customer> theCustomers = custometDAO.getCustomers();
        List<Customer> theCustomers = customerService.getCustomers();

        // add customers with theModel
        theModel.addAttribute("customers", theCustomers);
        return "list-customers";
    }
    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {
        Customer newCustomer = new Customer();
        theModel.addAttribute("customer", newCustomer);
        return "show-form";
    }
    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
        customerService.saveCustomer(theCustomer);
        return "redirect:/customer/list";
    }
}
