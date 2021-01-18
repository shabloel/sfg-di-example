package com.dependencyinjection.di.controllers;


import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("You've made it");
        return "hello folks!";
    }
}
