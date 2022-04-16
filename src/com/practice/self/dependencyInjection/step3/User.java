package com.practice.self.dependencyInjection.step3;

public class User {
    public static void main(String[] args) {
        Chocolate chocolate = new Chocolate();
        Size size = new Big();
        chocolate.setSize(size);
        System.out.println(chocolate.ExplainChocolate());
    }
}
