package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
    ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);
		new SubMainClass().doWork();

    FileManagerController1 qwe = run.getBean(FileManagerController1.class);
    qwe.sayHello();         // т.е. бин есть, но в autowired он не записывается

  }

}
