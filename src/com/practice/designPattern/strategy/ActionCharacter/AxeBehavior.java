package com.practice.designPattern.strategy.ActionCharacter;

public class AxeBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("도끼로 찍어서 공격하기");
    }
}
