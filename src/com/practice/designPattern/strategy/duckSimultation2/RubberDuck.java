package com.practice.designPattern.strategy.duckSimultation2;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyable = new FlyNoWay();
        quackable = new Ppick();
    }

    public RubberDuck(String color) {
        super(color);
        flyable = new FlyNoWay();
        quackable = new Ppick();
    }
}
