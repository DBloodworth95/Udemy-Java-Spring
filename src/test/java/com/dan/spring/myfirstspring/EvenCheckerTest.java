package com.dan.spring.myfirstspring;

import static com.dan.spring.myfirstspring.junit.EvenChecker.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvenCheckerTest {
    @Test
    public void checkWith2ReturnTrue() {
        assertTrue(checkEven(2));
    }
    @Test
    public void checkWith3ReturnFalse() {
        assertFalse(checkEven(3));
    }
}
