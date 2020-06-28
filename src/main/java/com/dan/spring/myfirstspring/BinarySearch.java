package com.dan.spring.myfirstspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//Tells spring that this is a bean.
@Component
//Scope is used to define whether or not we want to make this class a singleton or a prototype.
//Prototype means a new instance of this bean is created whenever our application context asks for it.
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearch {

    //Autowriing can be done by name or @Primary.
    //Because we have a BubbleSortAlgorithm class that impl Algorithm, if we name our Algorithm something like
    //bubbleSortAlgorithm, Spring will detect this ans use that class as opposed to another that also impl Algorithm.
    //This replaces @Primary annotation.
    @Autowired
    //Qualifier is a good feature to use when you have multiple implementations.
    //It uses a reference to plugin the appropriate dependency.
    @Qualifier("bubble")
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
