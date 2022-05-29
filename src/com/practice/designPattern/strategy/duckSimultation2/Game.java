package com.practice.designPattern.strategy.duckSimultation2;

public class Game {
    public static void main(String[] args) {
        Duck yellowRubberDuck = new RubberDuck("yellow");
        yellowRubberDuck.doFly();
        yellowRubberDuck.doQuack();
        System.out.println(yellowRubberDuck.color);
        yellowRubberDuck.setFlyBehavior(new FlyWithWings());
        yellowRubberDuck.doFly();

        System.out.println("");
        System.out.println("=========================");
        System.out.println("");

        Duck greenMallardDuck = new MallardDuck("green");
        greenMallardDuck.doFly();
        greenMallardDuck.doQuack();
        System.out.println(greenMallardDuck.color);

        System.out.println("");
        System.out.println("=========================");
        System.out.println("");

        Duck rubberDuck2 = new RubberDuck();
        System.out.println(rubberDuck2.color);
    }
}
