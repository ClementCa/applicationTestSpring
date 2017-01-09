package com.my.app.services;

import com.my.app.model.Customer;

import java.util.List;


public interface CustomerService {
    List<Customer> findAll();
}
