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
        Car car2 = applicationContext.getBean(Car.class);
        System.out.println(car + " " + car.getEngine());
        System.out.println(car2 + " " + car2.getEngine());
        applicationContext.close();
    }
}
