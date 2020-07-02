package com.dan.spring.myfirstspring;

import com.dan.spring.myfirstspring.basicexample.BinarySearch;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;


//Launches configuration
@RunWith(SpringRunner.class)
//Sets the context.
@ContextConfiguration(classes = BasicExampleMain.class)
public class BinarySearchTest {

    @Autowired
    BinarySearch binarySearch;

    @Test
    public void testBinarySearch() {
        int result = binarySearch.binarySearch(new int[]{2, 5, 10}, 5);
        assertEquals(result, 1);
    }
}
