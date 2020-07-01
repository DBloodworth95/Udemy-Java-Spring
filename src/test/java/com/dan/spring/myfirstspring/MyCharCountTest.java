package com.dan.spring.myfirstspring;

import static com.dan.spring.myfirstspring.junit.CountChar.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyCharCountTest {

    @Test
    public void testCharCountWithResult2() {
        assertEquals(2, countChar("hello", 'l'));
    }
}
