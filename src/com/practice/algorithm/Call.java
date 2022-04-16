package com.practice.algorithm;

public class Call {
    public static void swap(Object d , Object d2){
        System.out.println("dog - [before] = " + System.identityHashCode(d));
        System.out.println("dog2 - [before] = " + System.identityHashCode(d2));

        Object tmp = d;
        System.out.println("tmp - [before] = " + System.identityHashCode(tmp));

        d = d2;
        d2 = tmp;

        System.out.println("tmp - [after] = " + System.identityHashCode(tmp));
        System.out.println("dog - [after] = " + System.identityHashCode(d));
        System.out.println("dog2 - [after] = " + System.identityHashCode(d2));

    }

    public static void set(Dog d){
        d.setName("Molly");
    }

    public static void main(String[] args){
        Dog dog = new Dog("Sam");
        Dog dog2 = new Dog("Shawn");

        System.out.println("-----------Call by Reference-----------");
        System.out.println("dog - main[before] = " + System.identityHashCode(dog));
        System.out.println("dog2 - main[before] = " + System.identityHashCode(dog2));

        System.out.println(dog.name);  // output : Sam
        System.out.println(dog2.name); // output : Shawn

        swap(dog , dog2);

        System.out.println("dog - main[after] = " + System.identityHashCode(dog));
        System.out.println("dog2 - main[after] = " + System.identityHashCode(dog2));

        System.out.println(dog.name);  // output : Sam
        System.out.println(dog2.name); // output : Shawn

        // swap의 매개변수인 d와 d2가 참조하던 dog의 인스턴스가 바뀐 것이지 main메서드에 있는 dog, dog2 변수나 이 변수들이 참조하던 인스턴스들에는 어떠한 변화도 없다.

        System.out.println("-------------Call by value-------------");

        set(dog);

        System.out.println(dog.name);  // output : Molly
        System.out.println(dog2.name); // output : Shawn
    }
}
