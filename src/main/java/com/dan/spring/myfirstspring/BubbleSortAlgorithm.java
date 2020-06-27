package com.dan.spring.myfirstspring;

import org.springframework.stereotype.Component;
//Tells spring that his is a bean.
@Component
public class BubbleSortAlgorithm implements Algorithm{
    public int[] sort(int[]  numbers) {
        //Logic
        return numbers;
    }
}
