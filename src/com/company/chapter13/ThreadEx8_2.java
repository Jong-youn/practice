package com.company.chapter13;

public class ThreadEx8_2 extends Thread{
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.println("|");
        }

        System.out.println("<<th2 종료>>");
    }
}
