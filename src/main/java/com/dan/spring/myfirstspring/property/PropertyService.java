package com.dan.spring.myfirstspring.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertyService {

    @Value("${external.service.another.url}")
    private String url;

    public String returnUrl() {
        return url;
    }
}
