package com.dan.spring.myfirstspring.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
//We must provide a path to the file which contains the URL to the property source.
@PropertySource("classpath:app.properties")
public class ExternalContext {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ExternalContext.class);
        ExternalService externalService = applicationContext.getBean(ExternalService.class);
        System.out.println(externalService.returnServiceURL());

    }
}
