package com.practice.designPattern.strategy.ActionCharacter;

public class Queen extends Character{

    public Queen() {
        weapon = new AxeBehavior();
    }
}
