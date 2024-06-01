package com.devops.userManagement;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserController {

    @GetMapping("/hello")
    public String createUser() {
        return "This is a simple test program to test jenkins";
    }

        }



