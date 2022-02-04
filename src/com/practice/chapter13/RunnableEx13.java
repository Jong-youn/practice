package com.practice.chapter13;

public class RunnableEx13 implements Runnable {
    Account2 acc = new Account2();

    public void run() {
        while (acc.getBalance() > 0) {
            int money = (int)(Math.random() * 3 + 1) * 100;
            acc.withdraw(money);
            System.out.println("Thread: " + Thread.currentThread().getName() + ", money: " + money + ", balance: " + acc.getBalance());
        }
    }
}
