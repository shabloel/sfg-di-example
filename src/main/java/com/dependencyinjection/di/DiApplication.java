package com.dependencyinjection.di;

import com.dependencyinjection.di.controllers.ConstructorInjectedController;
import com.dependencyinjection.di.controllers.MyController;

import com.dependencyinjection.di.controllers.PropertyInjectedController;
import com.dependencyinjection.di.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiApplication {

    public static void main(String[] args) {

        ApplicationContext applC = SpringApplication.run(DiApplication.class, args);

        System.out.println("**********************");
        MyController myController = (MyController)applC.getBean("myController");
        String greeting = myController.sayHello();
        System.out.println(greeting);

        System.out.println("**********************");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController)applC.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());
        System.out.println("**********************");

        SetterInjectedController setterInjectedController = (SetterInjectedController) applC.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());
        System.out.println("**************************");

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) applC.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());
    }

}
