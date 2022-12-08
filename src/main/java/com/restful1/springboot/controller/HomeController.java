package com.restful1.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//This is for "telling" Springboot that this file is for rest endpoint 
@RestController


public class HomeController {

    @GetMapping("sayhello")
    public String sayHello() {
        return "Hello User";
    }
    
}
