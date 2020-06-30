package com.dan.spring.myfirstspring.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//This class provides the ability to access external sources such as a database.
//The URL is provided in an properties file from which we can access using this service class.
@Component
public class ExternalService {
    //Value to fetch from the properties file.
    @Value("${external.service.url}")
    private String url;

    public String returnServiceURL() {
        return url;
    }
}
