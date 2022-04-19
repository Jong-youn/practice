package com.practice.designPattern.decorator.cafe;

import java.util.HashMap;
import java.util.Hashtable;

public class Soy extends CondimentDecorator{
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "두유가 들어간 " + beverage.getDescription();
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
