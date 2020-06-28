package com.dan.spring.myfirstspring;

import com.dan.spring.myfirstspring.basicexample.BinarySearch;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BasicExampleMain {
    /*
    * First steps when it comes to utilizing dependency injection in Spring Framework:
    * 1. What are the beans? (What classes will we be instantiating).
    * 2. What are the dependencies of the bean?
    * 3. Where can we find the beans?
     */

    public static void main(String[] args) {
        //Sets the application context (Step 3).
        ApplicationContext applicationContext = SpringApplication.run(BasicExampleMain.class, args);
        //Fetching the bean that we want to use from the ApplicationContext.
        BinarySearch binarySearch = applicationContext.getBean(BinarySearch.class);
        int result = binarySearch.binarySearch(new int[] {12, 10, 3,2},3);
        System.out.println(result);
    }

}
