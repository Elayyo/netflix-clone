package com.netflix_clone.backend.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class RestController {

    @GetMapping("/greetings")
    public String test() {
        return "Hello World!";
    }
}