package com.learning.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerDemo implements CommandLineRunner {

    @Override
    public void run(String... args) {

        System.out.println("================================");
        System.out.println("Spring Boot Application Started");
        System.out.println("Learning CommandLineRunner");
        System.out.println("Application is Ready!");
        System.out.println("================================");
    }
}