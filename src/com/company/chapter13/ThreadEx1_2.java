package com.company.chapter13;

public class ThreadEx1_2 implements Runnable{

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
