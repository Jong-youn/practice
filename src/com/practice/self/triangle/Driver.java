package com.practice.self.triangle;

public class Driver {
    public static void main(String[] args) {
        Tire tire = new KoreaTire();
        Car tayo = new Car();

        tayo.setTire(tire);
        System.out.println(tayo.getTireBrand());
    }
}
