package com.learning.restapi;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class PutRequestController {

    @PutMapping("/{id}")
    public String updateStudent(
            @PathVariable int id,
            @RequestBody Student student) {

        return "Student ID " + id
                + " updated successfully. New Name: "
                + student.getName();
    }
}