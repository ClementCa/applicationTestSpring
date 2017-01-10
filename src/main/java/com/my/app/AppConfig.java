package com.my.app;

import com.my.app.repository.CustomerRepository;
import com.my.app.repository.HibernateCustomerRepositoryImpl;
import com.my.app.services.CustomerService;
import com.my.app.services.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.my.app"})
public class AppConfig {

/*    @Bean(name = "customerService")
    public CustomerService getCustormerService(){
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        return customerService;
    }

    @Bean(name = "customerRepository")
    public CustomerRepository getCustomerRepository(){
        return new HibernateCustomerRepositoryImpl();
    }*/
}
