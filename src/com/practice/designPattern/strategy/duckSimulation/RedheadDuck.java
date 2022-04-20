package com.practice.designPattern.strategy.duckSimulation;

public class RedheadDuck extends Duck{

    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("저는 머리가 붉은색인 오리입니다.");
    }
}
