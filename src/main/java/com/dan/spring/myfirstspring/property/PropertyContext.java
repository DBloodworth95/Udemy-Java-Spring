package com.dan.spring.myfirstspring.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class PropertyContext {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PropertyContext.class);
        PropertyService propertyService = applicationContext.getBean(PropertyService.class);
        System.out.println(propertyService.returnUrl());
    }
}
