package com.dan.spring.myfirstspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//Tells spring that this is a bean.
@Component
public class BinarySearch {

    //Autowriing can be done by name or @Primary.
    //Because we have a BubbleSortAlgorithm class that impl Algorithm, if we name our Algorithm something like
    //bubbleSortAlgorithm, Spring will detect this ans use that class as opposed to another that also impl Algorithm.
    //This replaces @Primary annotation.
    @Autowired
    private Algorithm algorithm;


    //Alternatively, you can use setter injection like so
    /*
    @Autowired
    public void setAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm;
    }
     */

    public int binarySearch(int[] numbers, int numberToSearch) {
        int[] sortedNumbers = algorithm.sort(numbers);
        System.out.println(algorithm);
        //Search logic.
        return 1;
    }
}
