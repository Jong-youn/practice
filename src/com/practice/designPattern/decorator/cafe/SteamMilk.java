package com.practice.designPattern.decorator.cafe;

public class SteamMilk extends CondimentDecorator {
    Beverage beverage;

    public SteamMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "스팀 밀크가 들어간 " + beverage.getDescription();
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        System.out.println(getSize());
        if (getSize() == Size.TALL) {
            cost += .10;
        } else if (getSize() == Size.GRANDE) {
            cost += .15;
        } else if (getSize() == Size.VENTI) {
            cost += .20;
        }

        return cost;
    }
}
