package com.dan.spring.myfirstspring.basicexample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
//Tells spring that this is a bean.
@Component
@Qualifier("bubble")
//If more than one @Component matches a type, you can use @Primary to set priority injection.
//Alternatively, you can set @Qualifer to plug in the appropriate dependency.
public class BubbleSortAlgorithm implements Algorithm{
    public int[] sort(int[]  numbers) {
        //Logic
        return numbers;
    }
}
