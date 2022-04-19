package com.practice.designPattern.decorator.cafe;

public class DarkRoast extends Beverage{
    public DarkRoast(Size size) {
        description = "다크 로스트";
        size = size;
    }

    public double cost() {
        return 0;
    }
}
