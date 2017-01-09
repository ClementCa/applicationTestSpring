package com.my.app.repository;

import com.my.app.model.Customer;

import java.util.List;


public interface CustomerRepository {
    List<Customer> findAll();
}
