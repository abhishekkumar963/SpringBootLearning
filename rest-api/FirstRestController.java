package com.learning.restapi;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class FirstRestController {

    @GetMapping("/api/hello")
    public String hello() {
        return "Welcome to my Spring Boot REST API Learning Journey!";
    }

    @GetMapping("/api/status")
    public String status() {
        return "Application is running successfully.";
    }
}