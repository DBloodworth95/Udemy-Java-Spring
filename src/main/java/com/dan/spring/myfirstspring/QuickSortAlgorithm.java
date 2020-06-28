package com.dan.spring.myfirstspring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements Algorithm {
    public int[] sort(int[]  numbers) {
        //Logic
        return numbers;
    }
}
