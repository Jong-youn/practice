package com.practice.self.dependencyInjection.step1;

public class User {
    public static void main(String[] args) {
        Chocolate chocolate = new Chocolate();
        System.out.println(chocolate.ExplainChocolate());
    }
}
