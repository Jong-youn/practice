package com.practice.self.triangle;

public class Car {
//    Tire tire = new KoreaTire();

    // 1. 생성자를 통한 의존성 주입
    Tire tire;

//    public Car(Tire tire) {
//        this.tire = tire;
//    }

    // 2. 속성을 통한 의존성 주입
    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public String getTireBrand() {
        return "타이어 원산지: " + tire.getBrand();
    }
}
