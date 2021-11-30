package guru.springframework.sfggi.controllers;

import guru.springframework.sfggi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Qualifier("propertyInjectedGreetingService")
    @Autowired
    GreetingService greetingService;

    @Autowired
    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
