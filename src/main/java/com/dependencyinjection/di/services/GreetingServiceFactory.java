package com.dependencyinjection.di.services;

import org.springframework.beans.factory.annotation.Autowired;

public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    @Autowired
    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lan) {
        switch (lan) {
        case "en":
            return new PrimaryGreetingService(greetingRepository);
        case "de":
            return new PrimarySpanishGreetingService(greetingRepository);
        case "es":
            return new PrimaryGermanGreetingService(greetingRepository);
        default:
            return new PrimaryGreetingService(greetingRepository);
        }
    }
}
