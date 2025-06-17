package com.netflix_clone.backend.rest;

import com.netflix_clone.backend.entity.User;
import com.netflix_clone.backend.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
@CrossOrigin
public class RestController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/greetings")
    public String test() {
        return "Hello World!!!!";
    }


    @PostMapping("/users")
    public User response(@RequestBody User theUser){

        theUser.setId(0);

        return userRepository.save(theUser);
    }

}