package com.practice.chapter13;

public class ThreadEx3_1 extends Thread{

    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.printf("%s", new String("|"));
        }

        System.out.print("소요시간2: " + (System.currentTimeMillis() - Thread3.startTime));
    }
}
