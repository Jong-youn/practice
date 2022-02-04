package com.company.chapter13;

public class Thread13 {
    public static void main(String[] args) {
        Runnable r = new RunnableEx13();
        new Thread(r).start();
        new Thread(r).start();
    }
}
