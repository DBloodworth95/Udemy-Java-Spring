package com.dan.spring.myfirstspring.myattempts.second;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Qualifier("v12")
@Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class V12 implements Engine {
    @Override
    public void start() {
        System.out.println(this + " V12 Engine started!");
    }
}
