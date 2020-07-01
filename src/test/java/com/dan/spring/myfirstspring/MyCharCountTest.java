package com.dan.spring.myfirstspring;

import com.dan.spring.myfirstspring.junit.CountChar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyCharCountTest {

    @Test
    public void testCharCountWithResult2() {
        CountChar countChar = new CountChar();
        int value = countChar.countChar("hello", 'l');
        assertEquals(2, value);
    }
}
