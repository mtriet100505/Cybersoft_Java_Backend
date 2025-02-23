package com.btvn.homework_spring_01.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public String welcomeMessage() {
        return "Welcome to Spring Boot!";
    }
}
