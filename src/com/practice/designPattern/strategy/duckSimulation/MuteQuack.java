package com.practice.designPattern.strategy.duckSimulation;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println(" - M U T E - ");
    }
}
