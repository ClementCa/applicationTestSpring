package com.my.app;

import com.my.app.services.CustomerService;
import com.my.app.services.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by CCA3441 on 09/01/2017.
 */
public class Application {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService customerService = applicationContext.getBean("customerService",CustomerService.class);
        System.out.println(customerService.findAll().get(0).getFirstName());
    }
}
