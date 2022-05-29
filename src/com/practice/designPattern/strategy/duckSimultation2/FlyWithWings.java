package com.practice.designPattern.strategy.duckSimultation2;

public class FlyWithWings implements Flyable{

    @Override
    public void fly() {
        System.out.println("Fly with wings");
    }
}
