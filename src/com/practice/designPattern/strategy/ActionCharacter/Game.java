package com.practice.designPattern.strategy.ActionCharacter;

public class Game {
    public static void main(String[] args) {
        Character queen = new Queen();
        queen.fight();
        queen.setWeapon(new SwordBehavior());
        queen.fight();
    }
}
