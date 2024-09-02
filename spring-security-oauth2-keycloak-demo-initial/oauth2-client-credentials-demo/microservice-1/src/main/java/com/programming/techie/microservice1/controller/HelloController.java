package com.programming.techie.microservice1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/api/home")
    @ResponseStatus(HttpStatus.OK)
    public String hello() {
        return "Hello Microservices";
    }
}
