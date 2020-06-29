package com.dan.spring.myfirstspring.myattempts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Bus {

    @Autowired
    @Qualifier("elderly")
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

}
