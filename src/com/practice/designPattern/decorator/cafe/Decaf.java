package com.practice.designPattern.decorator.cafe;

public class Decaf extends Beverage {
    public Decaf() {
        description = "디 카페인 음료";
    }

    public double cost() {
        return 3.99;
    }
}
