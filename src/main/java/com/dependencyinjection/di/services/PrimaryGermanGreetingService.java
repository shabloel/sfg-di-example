package com.dependencyinjection.di.services;

import org.springframework.beans.factory.annotation.Autowired;

public class PrimaryGermanGreetingService implements GreetingService {

    GreetingRepository greetingRepository;

    @Autowired
    public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}
