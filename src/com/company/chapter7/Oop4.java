package com.company.chapter7;

public class Oop4 {
    public static void main(String[] args) {
        MyTv t = new MyTv();
        t.setChannel(10);
        System.out.println("ch: " + t.getChannel());
        t.setVolume(20);
        System.out.println("vol: " + t.getVolume());

        MyTv t2 = new MyTv();
        t2.setChannel(10);
        System.out.println("t2.getChannel() = " + t2.getChannel());
        t2.setChannel(10);
        System.out.println("t2.getChannel() = " + t2.getChannel());
        t2.gotoPrevChannel();
        System.out.println("t2.getChannel() = " + t2.getChannel());
        t2.gotoPrevChannel();
        System.out.println("t2.getChannel() = " + t2.getChannel());
    }

}
