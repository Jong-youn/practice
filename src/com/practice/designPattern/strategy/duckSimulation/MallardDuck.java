package com.practice.designPattern.strategy.duckSimulation;

public class MallardDuck extends Duck{
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("저는 청둥오리 입니다.");
    }
}
