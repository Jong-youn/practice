package com.company.chapter13;

public class Interview {

    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        System.out.println("a==b = " + (v1 == v2));
        System.out.println("a.equals(b) = " + v1.equals(v2));
    }

    public static class Value{
        int value;

        Value(int value) {
            this.value = value;
        }
    }
}
