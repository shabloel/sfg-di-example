package com.dependencyinjection.di.services;

import org.springframework.beans.factory.annotation.Autowired;

public class PrimaryGreetingService implements GreetingService {

    GreetingRepository greetingRepository;

    @Autowired
    public PrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
}
