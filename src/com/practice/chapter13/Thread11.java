package com.practice.chapter13;

public class Thread11 {
    static long startTime = 0;

    public static void main(String[] args) {
        ThreadEx11_1 th1 = new ThreadEx11_1();
        ThreadEx11_2 th2 = new ThreadEx11_2();
        th1.start();
        th2.start();
        startTime = System.currentTimeMillis();

        try {
            th1.join();
            th2.join();
        } catch(InterruptedException e) {}

        System.out.println("소요시간: " + (System.currentTimeMillis() - Thread11.startTime));
    }
}
