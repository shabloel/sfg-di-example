package com.dependencyinjection.di.controllers;

import com.dependencyinjection.di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

    @Autowired
    public void setGreetingService(@Qualifier("setterInjectedGreetingService") GreetingService greetingService){
        this.greetingService = greetingService;
    }
}
