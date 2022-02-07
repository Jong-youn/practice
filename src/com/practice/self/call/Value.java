package com.practice.self.call;

public class Value {
    public static void main(String[] args) {
        int math = 80;
        int society = 70;
        System.out.println("main: math = " + math + ", society = " + society);

        addHomework(math, society);
        System.out.println("main: math = " + math + ", society = " + society);
    }

    private static void addHomework(int math, int society) {
        math += 10;
        society += 5;
        System.out.println("addHomeWork: math = " + math + ", society = " + society);
    }
}
