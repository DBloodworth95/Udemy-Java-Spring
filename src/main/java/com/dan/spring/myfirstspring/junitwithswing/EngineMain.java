package com.dan.spring.myfirstspring.junitwithswing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class EngineMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(EngineMain.class);
        Shelf shelf = applicationContext.getBean(Shelf.class);
        System.out.println(shelf);
        System.out.println(shelf.getEngineType());
    }
}
