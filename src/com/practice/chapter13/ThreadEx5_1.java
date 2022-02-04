package com.practice.chapter13;

public class ThreadEx5_1 extends Thread {
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                sleep(1000);
            } catch(Exception e) {}
        }
    }
}
