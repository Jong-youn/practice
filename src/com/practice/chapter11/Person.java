package com.practice.chapter11;

import java.util.Objects;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " : " + age;
    }

    public boolean equals(Object obj) {
        if(!(obj instanceof Person)) return false;
        Person p = (Person)obj;
        return name.equals(p.name) && age==p.age;
    }

    public int hashCode() {
        return Objects.hash(name, age);
    }
}
