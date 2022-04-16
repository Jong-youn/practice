package com.practice.self.dependencyInjection.step3;

public class Chocolate {

    Size size;

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String ExplainChocolate() {
        return "주문하신 초콜렛 크기는 " + size.ShowSize() + "입니다.";
    }
}
