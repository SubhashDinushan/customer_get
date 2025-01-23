package edu.icet.crm.service;

import edu.icet.crm.model.Customer;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImplV2 implements CustomerService {

    public Customer getCustomer(){
        Customer customer = new Customer();
        customer.setName("Subhash");
        customer.setAge("27");
        customer.setAddress("27");

        return customer;
    }
}
