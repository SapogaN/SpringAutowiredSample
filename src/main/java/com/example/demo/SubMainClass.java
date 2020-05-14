package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class SubMainClass {

  @Autowired
  public FileManagerController1 dependency;

  public void doWork() {

    if (dependency == null) {
      System.out.println("FileManagerController1 Bad");
    } else {
      System.out.println("FileManagerController1 Good");
    }
  }

  @Bean
  public FileManagerController1 qe(){
    return new FileManagerController1();
  }

}
