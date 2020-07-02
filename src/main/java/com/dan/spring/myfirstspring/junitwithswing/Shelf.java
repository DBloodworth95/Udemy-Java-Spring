package com.dan.spring.myfirstspring.junitwithswing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Shelf {

    @Autowired
    @Qualifier("V8")
    private Engine engine;

    public String getEngineType() {
        return engine.returnEngine();
    }
}
