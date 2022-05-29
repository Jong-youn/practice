package com.practice.designPattern.strategy.duckSimultation2;

public class Quack implements Quackable{
    @Override
    public void quack() {
        System.out.println("quack quack!");
    }
}
