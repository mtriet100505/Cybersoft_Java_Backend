package com.btvn.homework_spring_01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    private final String welcomeMessage;
    @Autowired
    public WelcomeController(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }
    @GetMapping("/welcome")
    public String getWelcomeMessage() {
        return welcomeMessage;
    }
}