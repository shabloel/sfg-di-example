package com.dependencyinjection.di.services;


import org.springframework.beans.factory.annotation.Autowired;

public class PrimarySpanishGreetingService implements GreetingService{

    GreetingRepository greetingRepository;

    @Autowired
    public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getSpanishGreeting();
    }
}
