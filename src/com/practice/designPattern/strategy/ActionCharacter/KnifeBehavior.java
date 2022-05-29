package com.practice.designPattern.strategy.ActionCharacter;

public class KnifeBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("칼로 베는 행동");
    }
}
