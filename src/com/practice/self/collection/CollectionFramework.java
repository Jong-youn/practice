package com.practice.self.collection;

import java.util.*;

public class CollectionFramework {

    public static void main(String[] args) {
        Vector v = new Vector(5);
        v.add("a");
        v.add("b");
        v.add("c");
        v.add("d");
        v.add("e");
        System.out.println("v.size() = " + v.size());
        
        ArrayList al = new ArrayList();
        System.out.println("al.size() = " + al.size());
        System.out.println("System.identityHashCode(al) = " + System.identityHashCode(al));
        al.add("a");
        System.out.println("al.size() = " + al.size());
        System.out.println("System.identityHashCode(al) = " + System.identityHashCode(al));

        LinkedList ll = new LinkedList();

        int[] arr = {0, 1, 2, 3, 4};
        System.out.println();

    }
}
