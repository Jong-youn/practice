package com.practice.designPattern.factory;

public class VeggiePizza extends Pizza{

    @Override
    void explain() {
        System.out.println("=== 채소 피자 주문 도착 ===");
    }
}
