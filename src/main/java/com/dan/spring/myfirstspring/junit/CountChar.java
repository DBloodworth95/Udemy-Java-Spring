package com.dan.spring.myfirstspring.junit;

public class CountChar {

    public int countChar(String value, char charToCount) {
        int count = 0;
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == charToCount)
                count += 1;
        }
        return count;
    }
}
