package com.practice.self.dependencyInjection;

public class Chocolate {

    Size size;

    public Chocolate() {
        size = new Big();
    }

    public String ExplainChocolate() {
        return "주문하신 초콜렛 크기는 " + size.ShowSize() + "입니다.";
    }
}
