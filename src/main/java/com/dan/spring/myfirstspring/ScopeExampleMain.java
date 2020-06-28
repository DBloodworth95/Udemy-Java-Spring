package com.dan.spring.myfirstspring;

import com.dan.spring.myfirstspring.mixingscopes.Person;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class ScopeExampleMain {

    private static final Logger LOGGER = LoggerFactory.getLogger(ScopeExampleMain.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(ScopeExampleMain.class, args);
        Person person = applicationContext.getBean(Person.class);
        Person anotherPerson = applicationContext.getBean(Person.class);

        LOGGER.info("{}", person);
        LOGGER.info("{}", person.getJdbcConnection());
        LOGGER.info("{}", anotherPerson);
        LOGGER.info("{}", anotherPerson.getJdbcConnection());
    }
}
