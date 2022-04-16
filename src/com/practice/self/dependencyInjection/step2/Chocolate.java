package com.practice.self.dependencyInjection.step2;

public class Chocolate {

    Size size;

    public Chocolate(Size size) {
        this.size = size;
    }

    public String ExplainChocolate() {
        return "주문하신 초콜렛 크기는 " + size.ShowSize() + "입니다.";
    }
}
