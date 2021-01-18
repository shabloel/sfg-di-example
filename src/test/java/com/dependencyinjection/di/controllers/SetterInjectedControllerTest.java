package com.dependencyinjection.di.controllers;

import com.dependencyinjection.di.services.GreetingService;
import com.dependencyinjection.di.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;
    GreetingService greetingService;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        assert(controller.getGreeting().equals("Hello everybody"));
    }
}