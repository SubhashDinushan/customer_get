package edu.icet.crm.service;

import edu.icet.crm.model.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    public Customer getCustomer(){
        Customer customer = new Customer();
        customer.setName("Subhash");
        customer.setAge("27");
        return customer;

    }
}
