package com.practice.chapter13;

public class Thread12 {

    public static void main(String[] args) {
        Runnable r = new RunnableEx12();
        new Thread(r).start();
        new Thread(r).start();
    }
}
