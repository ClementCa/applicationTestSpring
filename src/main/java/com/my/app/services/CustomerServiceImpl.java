package com.my.app.services;

import com.my.app.model.Customer;
import com.my.app.repository.CustomerRepository;

import java.util.List;


public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


}
