package com.practice.designPattern.decorator.cafe;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " (휘핑 추가)";
    }

    @Override
    public double cost() {
        return .05 + beverage.cost();
    }
}
