package com.dan.spring.myfirstspring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements Algorithm {
    public int[] sort(int[]  numbers) {
        //Logic
        return numbers;
    }
}
