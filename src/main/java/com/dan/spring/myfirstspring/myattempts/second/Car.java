package com.dan.spring.myfirstspring.myattempts.second;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Car {
    @Autowired
    @Qualifier("v8")
    private Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
