package com.company.chapter11;

import java.util.HashSet;

public class Collection11 {

    public static void main(String[] args) {

        HashSet set = new HashSet();
        set.add("abc");
        set.add("abc");
        set.add(new Person("David", 10));
        set.add(new Person("David", 10));

        System.out.println(set);
    }
}