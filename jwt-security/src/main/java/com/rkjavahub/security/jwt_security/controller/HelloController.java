package com.rkjavahub.security.jwt_security.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/helloUser")
    @PreAuthorize("hasRole('USER')")
    public String helloUser() {
        return "Hello User";
    }

    @GetMapping("/helloAdmin")
    @PreAuthorize("hasRole('ADMIN')")
    public String helloAdmin() {
        return "Hello Admin";
    }
}
