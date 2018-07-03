package com.xy.api.controller;

import com.sun.deploy.nativesandbox.comm.Request;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello springMvc！";
    }
}
