package com.learning.restapi;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PathVariableController {

    @GetMapping("/students/{id}")
    public String getStudentById(@PathVariable int id) {

        return "Fetching student with ID: " + id;
    }

    @GetMapping("/students/{id}/courses/{courseId}")
    public String getStudentCourse(
            @PathVariable int id,
            @PathVariable int courseId) {

        return "Student ID: " + id
                + ", Course ID: " + courseId;
    }
}