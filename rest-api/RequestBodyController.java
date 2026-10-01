package com.learning.restapi;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class RequestBodyController {

    @PostMapping
    public User createUser(@RequestBody User user) {

        return user;
    }

    @PostMapping("/welcome")
    public String welcomeUser(@RequestBody User user) {

        return "Welcome " + user.getName()
                + "! Your email is " + user.getEmail();
    }
}