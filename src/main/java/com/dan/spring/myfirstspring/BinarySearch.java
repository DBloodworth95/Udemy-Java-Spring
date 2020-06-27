package com.dan.spring.myfirstspring;

import org.springframework.stereotype.Component;
//Tells spring that this is a bean.
@Component
public class BinarySearch {

    private final Algorithm algorithm;

    public BinarySearch(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

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
