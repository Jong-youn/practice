package com.practice.self.dependencyInjection;

public class User {
    public static void main(String[] args) {
        Chocolate chocolate = new Chocolate();
        System.out.println(chocolate.ExplainChocolate());
    }
}
