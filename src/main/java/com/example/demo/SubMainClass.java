package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
}
