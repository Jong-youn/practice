package com.practice.chapter6;

public class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Student() {

    }

    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String info() {
        return "I'm " + name + " My grade is math: " + math + ", kor: " + kor + ", eng: " + eng;
    }

    public int getTotal() {
        return kor + eng + math;
    }

    public float getAverage() {
//        return String.format("%.2f",getTotal()/3);
//        return Math.round(getTotal()/3*100)/100;
        return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
    }
}
