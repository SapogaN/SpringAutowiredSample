package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);

        SubMainClass smc = run.getBean(SubMainClass.class);
        smc.doWork();

        FileManagerController1 qwe = run.getBean(FileManagerController1.class);
        qwe.sayHello();
    }
}
