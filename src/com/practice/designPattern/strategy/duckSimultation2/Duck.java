package com.practice.designPattern.strategy.duckSimultation2;

public abstract class Duck {
    Flyable flyable;
    Quackable quackable;

    String color = "white";

    public Duck() {}

    public Duck(String color) {
        this.color = color;
    }

    public void doFly() {
        flyable.fly();
    }

    public void doQuack() {
        quackable.quack();
    }

    public void setFlyBehavior(Flyable flyBehavior) {
        this.flyable = flyBehavior;
    }

    public void setQuackBehavor(Quackable quackBehavor) {
        this.quackable = quackBehavor;
    }
}
