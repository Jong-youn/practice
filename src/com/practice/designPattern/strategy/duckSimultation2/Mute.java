package com.practice.designPattern.strategy.duckSimultation2;

public class Mute implements Quackable{
    @Override
    public void quack() {
        System.out.println(". . . ... .....");
    }
}
