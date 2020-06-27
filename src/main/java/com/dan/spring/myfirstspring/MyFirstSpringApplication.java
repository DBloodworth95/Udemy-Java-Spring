package com.dan.spring.myfirstspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyFirstSpringApplication {

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch(new BubbleSortAlgorithm());
        int result = binarySearch.binarySearch(new int[] {12, 10, 3,2},3);
        System.out.println(result);
        SpringApplication.run(MyFirstSpringApplication.class, args);
    }

}
