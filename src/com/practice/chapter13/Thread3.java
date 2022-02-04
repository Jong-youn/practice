package com.practice.chapter13;

public class Thread3 {

    static long startTime = 0;

    public static void main(String[] args) {
        ThreadEx3_1 th1 = new ThreadEx3_1();
        th1.start();
        startTime = System.currentTimeMillis();

        for (int i = 0; i < 300; i++)
            System.out.printf("%s", new String("-"));

        System.out.printf("소요시간1 " + (System.currentTimeMillis() - Thread3.startTime));
    }
}
