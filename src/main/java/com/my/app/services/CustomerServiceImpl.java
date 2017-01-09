package com.my.app.services;

import com.my.app.model.Customer;
import com.my.app.repository.CustomerRepository;
import com.my.app.repository.HibernateCustomerRepositoryImpl;

import java.util.List;


public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    @Override
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }


}
