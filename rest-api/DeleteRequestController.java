package com.learning.restapi;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class DeleteRequestController {

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {

        return "Student with ID " + id + " deleted successfully.";
    }
}