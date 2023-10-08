package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Autowired      //object will automatically be created by spring
    Laptop lap;
    
    public void code(){
        // System.out.println("I am coding...");
        lap.compile();
    }
}
