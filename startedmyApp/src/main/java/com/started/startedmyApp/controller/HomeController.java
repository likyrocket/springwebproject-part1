package com.started.startedmyApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String greet(){

        return "welcome to my home!!!";
    }
    @RequestMapping("/about")
    public String about(){

        return "know about myself";
    }    
}
