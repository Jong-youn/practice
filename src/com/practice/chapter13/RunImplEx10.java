package com.practice.chapter13;

public class RunImplEx10 implements Runnable{
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {}
        }
    }
}
