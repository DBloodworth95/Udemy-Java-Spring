package com.dan.spring.myfirstspring.myattempts.second;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
    @Autowired
    private Engine engine;

    public void accelerate() {
        engine.start();
    }
}
