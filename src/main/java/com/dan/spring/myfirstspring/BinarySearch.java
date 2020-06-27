package com.dan.spring.myfirstspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//Tells spring that his is a bean.
@Component
public class BinarySearch {
    //Tells Spring that Algorithm is a dependency for BinarySearch
    @Autowired
    private Algorithm algorithm;

    public BinarySearch(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public int binarySearch(int[] numbers, int numberToSearch) {
        int[] sortedNumbers = algorithm.sort(numbers);
        System.out.println(algorithm);
        //Search logic.
        return 1;
    }
}
