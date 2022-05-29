package com.practice.self.reflection;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Reflection {
    public static void main(String[] args) {
        Class a = "foo".getClass();
        System.out.println("a = " + a);

        byte[] b = new byte[1024];
        Class c1 = b.getClass();
        System.out.println(c1);     //class [B

        Set<String> s = new HashSet<>();
        Class c2 = s.getClass();
        System.out.println(c2);     //class java.util.HashSet

        boolean bl;
//        Class c3 = bl.getClass();   //컴파일 에러 발생
        Class c4 = boolean.class;
        System.out.println("c4 = " + c4);

        Duck d = new Duck();
        Class c5 = d.getClass();
        Field[] fields = c5.getDeclaredFields();
        System.out.println("c5 = " + c5);
        for (final Field field : fields) { // field의 type, name 출력
            System.out.printf("%s %s\n", field.getType(), field.getName());
        }
    }
}
