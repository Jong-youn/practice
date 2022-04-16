package com.practice.self.dependencyInjection.step2;

public class User {
    public static void main(String[] args) {
        Size size = new Big();
        Chocolate chocolate = new Chocolate(size);
        System.out.println(chocolate.ExplainChocolate());
    }
}
