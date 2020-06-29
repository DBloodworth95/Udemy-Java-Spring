package com.dan.spring.myfirstspring;

import com.dan.spring.myfirstspring.myattempts.Bus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyAttemptsMain {

    private static final Logger LOGGER = LoggerFactory.getLogger(ScopeExampleMain.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(MyAttemptsMain.class, args);
        Bus bus = applicationContext.getBean(Bus.class);
        Bus anotherBus = applicationContext.getBean(Bus.class);
        LOGGER.info("{}", bus);
        LOGGER.info("{}", bus.getCustomer());
        LOGGER.info("{}", anotherBus);
        LOGGER.info("{}",anotherBus.getCustomer());
    }
}
