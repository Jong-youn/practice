package com.practice.designPattern.strategy.duckSimulation;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("꽥꽥");
    }
}
