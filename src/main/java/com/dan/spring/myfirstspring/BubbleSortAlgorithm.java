package com.dan.spring.myfirstspring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//Tells spring that this is a bean.
@Component
//If more than one @Component matches a type, you can use @Primary to set priority injection.
public class BubbleSortAlgorithm implements Algorithm{
    public int[] sort(int[]  numbers) {
        //Logic
        return numbers;
    }
}
