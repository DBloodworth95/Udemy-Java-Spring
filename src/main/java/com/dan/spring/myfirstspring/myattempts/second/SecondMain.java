package com.dan.spring.myfirstspring.myattempts.second;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SecondMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SecondMain.class);
        Car car = applicationContext.getBean(Car.class);
        Lorry lorry = applicationContext.getBean(Lorry.class);
    }
}
