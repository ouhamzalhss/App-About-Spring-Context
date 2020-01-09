package com.test;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicule{

    public void drive(){
        System.out.println("Bike driving..");
    }
}
