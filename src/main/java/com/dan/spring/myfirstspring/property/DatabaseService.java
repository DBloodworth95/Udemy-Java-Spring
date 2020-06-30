package com.dan.spring.myfirstspring.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatabaseService {
    @Value("${external.service.db.url}")
    private String url;

    public String returnDbUrl() {
        return url;
    }
}
