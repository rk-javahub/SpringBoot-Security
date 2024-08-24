package com.rkjavahub.security.h2databaseauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String helloUser() {
        return "Hello User";
    }
}
