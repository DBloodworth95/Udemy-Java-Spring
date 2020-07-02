package com.dan.spring.myfirstspring.junitwithswing;

import org.springframework.stereotype.Component;

@Component
public class V12 implements Engine {

    @Override
    public String returnEngine() {
        return "V12";
    }
}
