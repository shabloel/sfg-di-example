package com.dependencyinjection.di.controllers;

import com.dependencyinjection.di.services.GreetingService;
import com.dependencyinjection.di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController controller;
    GreetingService greetingService;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        assert(controller.getGreeting().equals("Hello everybody"));
    }
}