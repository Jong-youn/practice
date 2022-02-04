package com.practice.self;

public class Equals {
    public static void main(String[] args) {
        String a = "aaa";
        String b = "aaa";
        String c = new String("aaa");
        String d = new String("aaa");
        String e = c;

        System.out.println("System.identityHashCode(a) = " + System.identityHashCode(a));
        System.out.println("System.identityHashCode(b) = " + System.identityHashCode(b));
        System.out.println("System.identityHashCode(c) = " + System.identityHashCode(c));
        System.out.println("System.identityHashCode(d) = " + System.identityHashCode(d));

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a == b);
        System.out.println(a == c);

        System.out.println(c.equals(d));
        System.out.println(c == d);

        System.out.println(c.equals(e)); //true
        System.out.println(c == e); // true
    }
}
