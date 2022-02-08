package com.practice.self.triangle;

public class Car {
    Tire tire = new KoreaTire();

    public String getTireBrand() {
        return "타이어 원산지: " + tire.getBrand();
    }
}
