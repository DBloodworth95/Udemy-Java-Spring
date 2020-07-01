package com.dan.spring.myfirstspring.junit;

public class SumClass {
    public int getSum(int[] numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }
}
