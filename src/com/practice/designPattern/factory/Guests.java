package com.practice.designPattern.factory;

public class Guests {

    public static void main(String[] args) {
        PizzaStore store = new PizzaStore();
        Pizza cheesePizza = store.orderPizza("cheese");

    }
}
