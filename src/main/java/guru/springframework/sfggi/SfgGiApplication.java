package guru.springframework.sfggi;

import guru.springframework.sfggi.controllers.ConstructorInjectedController;
import guru.springframework.sfggi.controllers.MyController;
import guru.springframework.sfggi.controllers.PropertyInjectedController;
import guru.springframework.sfggi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgGiApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SfgGiApplication.class, args);
        MyController myController = (MyController) ctx.getBean("myController");
		System.out.println("---primary bean");
        System.out.println(myController.sayHello());

        System.out.println("----property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("----setter");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

        System.out.println("----constructor");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

    }

}
