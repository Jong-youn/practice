package com.practice.designPattern.strategy.duckSimulation;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("삑 삑");
    }
}
