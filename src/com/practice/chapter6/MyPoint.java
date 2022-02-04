package com.practice.chapter6;

public class MyPoint {
    int x;
    int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double getDistance(int x1, int y1) {
        return Math.sqrt(Math.pow((x1-this.x), 2) + Math.pow((y1-this.y), 2));
    }
}
