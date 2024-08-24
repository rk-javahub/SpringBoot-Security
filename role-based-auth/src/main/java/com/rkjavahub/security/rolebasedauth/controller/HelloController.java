package com.rkjavahub.security.in_memory_auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String helloUser() {
        return "Hello User";
    }
}
