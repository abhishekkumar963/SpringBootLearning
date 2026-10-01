package com.learning.restapi;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RequestParamController {

    @GetMapping("/search")
    public String searchStudent(
            @RequestParam String name) {

        return "Searching student: " + name;
    }

    @GetMapping("/filter")
    public String filterStudents(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int size) {

        return "Page: " + page + ", Page Size: " + size;
    }
}