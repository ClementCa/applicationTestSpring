package com.my.app;

import com.my.app.services.CustomerService;
import com.my.app.services.CustomerServiceImpl;

/**
 * Created by CCA3441 on 09/01/2017.
 */
public class Application {
    public static void main(String[] args){
        CustomerService service = new CustomerServiceImpl();
        System.out.println(service.findAll().get(0).getFirstName());
    }
}
