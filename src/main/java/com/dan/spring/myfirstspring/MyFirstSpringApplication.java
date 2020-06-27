package com.dan.spring.myfirstspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyFirstSpringApplication {
    /*
    * First steps when it comes to utilizing the Spring Framework:
    * 1. What are the beans? (What classes will we be instantiating).
    * 2. What are the dependencies of the bean?
    * 3. Where can we find the beans?
     */

    public static void main(String[] args) {
        //Sets the application context (Step 3).
        ApplicationContext applicationContext = SpringApplication.run(MyFirstSpringApplication.class, args);
        //Fetching the bean that we want to use from the ApplicationContext.
        BinarySearch binarySearch = applicationContext.getBean(BinarySearch.class);
        int result = binarySearch.binarySearch(new int[] {12, 10, 3,2},3);
        System.out.println(result);
    }

}
