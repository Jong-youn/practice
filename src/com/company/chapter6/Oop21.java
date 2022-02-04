package com.company.chapter6;

public class Oop21 {

    static int abs(int k) {
        if (k < 0) {
            return -k;
        } else {
            return k;
        }
    }

    public static void main(String[] args) {
        int value = 5;
        System.out.println(value + "의 절대값: " + abs(value));
        value = -10;
        System.out.println(value + "의 절대값: " + abs(value));
    }
}
