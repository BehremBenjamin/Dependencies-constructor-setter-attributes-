package guru.springframework.sfggi.controllers;

import guru.springframework.sfggi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {
    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorGreetingService());
        
    }

    @Test
    void getGreeting() {
        controller.getGreeting();
    }
}