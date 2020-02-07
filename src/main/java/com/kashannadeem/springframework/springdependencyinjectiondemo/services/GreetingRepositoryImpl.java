package com.kashannadeem.springframework.springdependencyinjectiondemo.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getGermanGreeting() {
        return "Hallo! - Primärer Grußdienst";
    }

    @Override
    public String getSpanishGreeting() {
        return "Hola - Servicio de Saludo Primario";
    }
}
