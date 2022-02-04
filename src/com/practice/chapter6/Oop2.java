package com.practice.chapter6;

public class Oop2 {
    public static void main(String[] args) {
        Student s = new Student("Timothee", 1, 1, 100, 60, 76);

        String str = s.info();
        System.out.println(str);
    }

}
