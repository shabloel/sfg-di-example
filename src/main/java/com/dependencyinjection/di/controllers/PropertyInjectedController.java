package com.dependencyinjection.di.controllers;

import com.dependencyinjection.di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("propertyInjectedGreetingService")
    GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
