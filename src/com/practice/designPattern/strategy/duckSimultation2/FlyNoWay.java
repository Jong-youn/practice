package com.practice.designPattern.strategy.duckSimultation2;

public class FlyNoWay implements Flyable{

    @Override
    public void fly() {
        System.out.println("Fly no way");
    }
}
