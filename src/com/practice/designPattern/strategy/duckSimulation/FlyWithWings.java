package com.practice.designPattern.strategy.duckSimulation;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("날개로 날아다님");
    }
}
