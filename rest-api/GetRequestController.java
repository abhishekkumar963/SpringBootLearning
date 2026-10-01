package com.learning.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class GetRequestController {

    @GetMapping("/api/students")
    public List<String> getStudents() {
        return List.of("Abhishek", "Rahul", "Aman", "Priya");
    }

    @GetMapping("/api/courses")
    public List<String> getCourses() {
        return List.of("Java", "Spring Boot", "SQL", "REST API");
    }
}