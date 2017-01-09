package com.my.app.repository;

import com.my.app.model.Customer;

import java.util.List;

/**
 * Created by CCA3441 on 09/01/2017.
 */
public interface CustomerRepository {
    List<Customer> findAll();
}
