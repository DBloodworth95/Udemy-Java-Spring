package com.dan.spring.myfirstspring;

import com.dan.spring.myfirstspring.basicexample.BinarySearch;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BasicExampleMain {
    /*
    * First steps when it comes to utilizing dependency injection in Spring Framework:
    * 1. What are the beans? (What classes will we be instantiating).
    * 2. What are the dependencies of the bean?
    * 3. Where can we find the beans?
     */

    public static void main(String[] args) {
        //Sets the application context (Step 3).
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BasicExampleMain.class);
        //Fetching the bean that we want to use from the ApplicationContext.
        BinarySearch binarySearch = applicationContext.getBean(BinarySearch.class);
        int result = binarySearch.binarySearch(new int[] {12, 10, 3,2},3);
        System.out.println(result);
        applicationContext.close();
    }

}
