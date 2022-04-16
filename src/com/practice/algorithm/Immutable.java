package com.practice.algorithm;


public class Immutable {

    public static void main(String[] args) {
        Integer a = 5;
        System.out.println("a = " + System.identityHashCode(a));
        a = 6;
        System.out.println("a = " + System.identityHashCode(a));

        String b = "abc";
        System.out.println("b = " + System.identityHashCode(b));
        b = "cde";
        System.out.println("b = " + System.identityHashCode(b));

        StringBuffer c = new StringBuffer("abc");
        System.out.println("c = " + System.identityHashCode(c));
        c = new StringBuffer("bcd");
        System.out.println("c = " + System.identityHashCode(c));
        c.append("ggswe");
        System.out.println("c = " + System.identityHashCode(c));
        c.delete(3, 5);
        System.out.println("c = " + c.toString() + System.identityHashCode(c));  // bcdggswe -> bcdswe
        c.append("asdasgsegsfghseawrggrsfdgabsfdfssfgsrtsghsrtdghsasgsdadsasdadwrfgdfsdasdsfffffffffffffdf czzzzzzzzdwqweeerfgdsawrtgasfafgsfdsfadsfadgqweqerwqdfsssfsadvxzxcvzxsadgfsffsfdsadsfadsfdasdgasfdfs");
        System.out.println("c = " + System.identityHashCode(c));


        StringBuffer d = new StringBuffer(3);
        d.append("abc");
        System.out.println("d = " + System.identityHashCode(d));
        d.append("dcefgsadsdaf");
        System.out.println("d = " + System.identityHashCode(d));
    }
}
