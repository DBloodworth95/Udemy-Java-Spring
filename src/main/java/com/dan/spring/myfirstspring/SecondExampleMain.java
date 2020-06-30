package com.dan.spring.myfirstspring;

import com.dan.spring.myfirstspring.myattempts.third.A;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SecondExampleMain {

    private static final Logger LOGGER = LoggerFactory.getLogger(SecondExampleMain.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SecondExampleMain.class);
        A a = applicationContext.getBean(A.class);
        LOGGER.info("{}", a);
        LOGGER.info("{}", a.getI());

    }
}
