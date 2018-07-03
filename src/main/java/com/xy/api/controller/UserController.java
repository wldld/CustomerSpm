package com.xy.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping("/hello2")
    public String hello(){
        return "Hello SpringMvc222222";
    }
}
