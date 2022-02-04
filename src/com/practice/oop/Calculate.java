package com.practice.oop;

public class Calculate {         // 클래스 : static
    static int performance = 50; // 전역변수 : static

    public static void main(String[] args) { // 메서드 : stack
        int exam = 45;    // 지역변수 : stack
        int music;        // 지역변수 : stack
        music = plus(exam, performance);

        Students jay = new Students();       // stack, heap

        jay.name = "Jay";         // 객체 : heap
        jay.points = music;       // 객체 : heap

        jay.postReport();         // 객체 : heap
    }

    private static int plus(int x, int y) {   // 메서드 : stack

        int result = x + y;       // 지역변수 : stack

        return result;
    }
}
