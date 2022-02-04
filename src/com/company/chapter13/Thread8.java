package com.company.chapter13;

public class Thread8 {
    public static void main(String[] args) {
        ThreadEx8_1 th1 = new ThreadEx8_1();
        ThreadEx8_2 th2 = new ThreadEx8_2();

        th1.start();
        th2.start();

        try {
            th1.sleep(2000);
        } catch (InterruptedException e) {
        }

        System.out.println("<<main 종료>>");
    }
}
