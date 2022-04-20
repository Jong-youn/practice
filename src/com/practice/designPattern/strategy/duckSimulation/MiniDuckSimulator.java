package com.practice.designPattern.strategy.duckSimulation;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.display();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.performFly();

        Duck redHeadDuck = new RedheadDuck();
        redHeadDuck.display();
        redHeadDuck.performQuack();
        redHeadDuck.performFly();

        Duck rocketDuck = new ModelDuck();
        rocketDuck.display();
        rocketDuck.performFly();
        rocketDuck.setFlyBehavior(new FlyRocketPowered());
        rocketDuck.performFly();
    }
}
