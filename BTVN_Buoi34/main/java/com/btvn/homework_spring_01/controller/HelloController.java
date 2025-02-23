package com.btvn.homework_spring_01.controller;

import com.btvn.homework_spring_01.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private MessageService messageService;
    @Autowired

    public HelloController(MessageService messageService) {
        this.messageService = messageService;
    }
    @GetMapping("/hello")
    public String hello(){
        return messageService.getMessage();
    }
}
