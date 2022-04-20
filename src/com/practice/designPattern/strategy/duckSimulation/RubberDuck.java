package com.practice.designPattern.strategy.duckSimulation;

public class RubberDuck extends Duck{
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("저는 고무 오리 입니다.");
    }
}
