package com.dan.spring.myfirstspring;

import com.dan.spring.myfirstspring.myattempts.Bus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class MyAttemptsMain {

    private static final Logger LOGGER = LoggerFactory.getLogger(ScopeExampleMain.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyAttemptsMain.class);
        Bus bus = applicationContext.getBean(Bus.class);
        Bus anotherBus = applicationContext.getBean(Bus.class);
        LOGGER.info("{}", bus);
        LOGGER.info("{}", bus.getCustomer());
        LOGGER.info("{}", anotherBus);
        LOGGER.info("{}",anotherBus.getCustomer());
    }
}
