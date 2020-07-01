package com.dan.spring.myfirstspring;

import com.dan.spring.myfirstspring.junit.EvenChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvenCheckerTest {
    @Test
    public void checkWith2ReturnTrue() {
        EvenChecker evenChecker = new EvenChecker();
        boolean isTrue = evenChecker.checkEven(2);
        assertTrue(isTrue);
    }
    @Test
    public void checkWith3ReturnFalse() {
        EvenChecker evenChecker = new EvenChecker();
        boolean isFalse = evenChecker.checkEven(3);
        assertFalse(isFalse);
    }
}
