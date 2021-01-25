package com.dependencyinjection.di;

import com.dependencyinjection.di.controllers.ConstructorInjectedController;
import com.dependencyinjection.di.controllers.I18nController;
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

/*        System.out.println("**********************");
        I18nController i18nController = (I18nController)applC.getBean("i18nController");
        System.out.println(i18nController.sayHello());*/

        System.out.println("**********************");
        MyController myController = (MyController)applC.getBean("myController");
        System.out.println(myController.sayHello());

 /*       System.out.println("**********************");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController)applC.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());
        System.out.println("**********************");

        SetterInjectedController setterInjectedController = (SetterInjectedController) applC.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());
        System.out.println("**************************");

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) applC.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());*/

        System.out.println(applC.getBean(PropertyInjectedController.class).getGreeting());
        System.out.println(applC.getBean(SetterInjectedController.class).getGreeting());
        System.out.println(applC.getBean(ConstructorInjectedController.class).getGreeting());
    }

}
