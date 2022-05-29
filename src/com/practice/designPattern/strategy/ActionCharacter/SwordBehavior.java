package com.practice.designPattern.strategy.ActionCharacter;

public class SwordBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("칼로 찔러 공격하기");
    }
}
