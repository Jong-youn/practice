package com.practice.designPattern.factory;

public abstract class Pizza {

    abstract void explain();

    public void prepare() {
        System.out.println("준비중");
    }

    public void bake() {
        System.out.println("굽는중");
    }

    public void cut() {
        System.out.println("자르는중");
    }

    public void box() {
        System.out.println("상자에 담는 중");
    }
}
