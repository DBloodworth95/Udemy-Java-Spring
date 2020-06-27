package com.dan.spring.myfirstspring;

public class BinarySearch {
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
