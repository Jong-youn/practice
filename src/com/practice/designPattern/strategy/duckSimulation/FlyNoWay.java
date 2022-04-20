package com.practice.designPattern.strategy.duckSimulation;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("날 수 없어");
    }
}
