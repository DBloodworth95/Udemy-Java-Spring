package com.dan.spring.myfirstspring.myattempts;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Qualifier("regular")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class RegularCustomer implements Customer {
    @Override
    public boolean isElderly() {
        return false;
    }
}
