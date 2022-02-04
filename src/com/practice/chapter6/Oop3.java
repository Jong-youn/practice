package com.practice.chapter6;

public class Oop3 {
    public static void main(String[] args) {
        Student s = new Student("bum", 1, 1, 100, 60, 76);

        System.out.println("이름: " + s.name);
        System.out.println("총점: " + s.getTotal());
        System.out.println("평균: " + s.getAverage());
    }
}
