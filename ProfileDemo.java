package com.learning.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileDemo {

    @Value("${app.environment}")
    private String environment;

    @GetMapping("/environment")
    public String getEnvironment() {
        return "Current Environment: " + environment;
    }
}