package com.practice.designPattern.strategy.duckSimultation2;

public class MallardDuck extends Duck{

    public MallardDuck() {
        flyable = new FlyWithWings();
        quackable = new Quack();
    }

    public MallardDuck(String color) {
        super(color);
        flyable = new FlyWithWings();
        quackable = new Quack();
    }
}
