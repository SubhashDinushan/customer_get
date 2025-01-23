package edu.icet.crm.controller;

import edu.icet.crm.model.Customer;
import edu.icet.crm.service.CustomerService;
import edu.icet.crm.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    CustomerService service;

    @GetMapping("/customer-name")
    public Customer getCustomerDetails(){
       return service.getCustomer();
    }
}
