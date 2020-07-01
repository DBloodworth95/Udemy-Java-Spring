package com.dan.spring.myfirstspring;

import static com.dan.spring.myfirstspring.junit.SumClass.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MySumTest {

    @Test
    public void testSumWith3Numbers() {
        int[] numbers = {1, 2, 3};
        int result = getSum(numbers);
        assertEquals(6, result);
    }
}
