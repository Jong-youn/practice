package com.practice.self.lambda;

import java.util.Arrays;

public class B001 {

    public static void main(String[] args) {
//        MyTest mt = new MyTest();
        Runnable r = () ->  System.out.println("HELLO LAMBDA");
        r.run();

        // 함수형 인터페이스
        System.out.println("-- <함수형 인터페이스> --");
        MyFunctionalInterface mfi = a ->  a * a;
        int b = mfi.runSomething(5);
        System.out.println(b);

        // 메서드 호출 인자로 람다 사용
        System.out.println("-- <메서드 호출 인자로 람다 사용> --");
        MyFunctionalInterface2 mfi2 = a -> a * a;
        doIt(mfi2);

        // 컬렉션 스트림에서 람다 사용
        System.out.println("-- <컬렉션 스트림에서 람다 사용 - for each> --");
        Integer[] ages = {20, 24, 18, 27, 64, 34, 13};
        for (int age: ages) {
            if (age < 20) {
                System.out.format("Age %d!!! can't enter\n", age);
            }
        }

        // 컬렉션 스트림에서 람다 사용
        System.out.println("-- <컬렉션 스트림에서 람다 사용> --");
        Arrays.stream(ages)
                .filter(age -> age < 20)
                .forEach(age -> System.out.format("Age %d!!! can't enter\n", age));

        // 스트림에서 제공하는 메서드
        System.out.println("-- <스트림에서 제공하는 메서드> --");
        System.out.println(Arrays.stream(ages).count());  // 7

        System.out.println(Arrays.stream(ages).mapToInt(age -> age).sum());     // 200
        System.out.println(Arrays.stream(ages).mapToInt(age -> age).average()); // 28.57
        System.out.println(Arrays.stream(ages).mapToInt(age -> age).min());     // 13
        System.out.println(Arrays.stream(ages).mapToInt(age -> age).max());     // 64

        System.out.println(Arrays.stream(ages).allMatch(age -> age > 20));  // false
        System.out.println(Arrays.stream(ages).anyMatch(age -> age > 20));  // true

        System.out.println(Arrays.stream(ages).findFirst());  //20
        System.out.println(Arrays.stream(ages).findAny());    //20

        Arrays.stream(ages).sorted().forEach(System.out::println);

        String a = new String("word");
        System.out.println("System.identityHashCode(a) = " + System.identityHashCode(a));
//        a.close();
        System.out.println("System.identityHashCode(a) = " + System.identityHashCode(a));

    }

    public static void doIt(MyFunctionalInterface2 mfi2) {
        int b = mfi2.runSomething(5);
        System.out.println(b);
    }
}
