package com.practice.self.call;

public class Reference {
    public static void main(String[] args) {
//        Integer math = new Integer(80);
//        Integer society = new Integer(70);
//        System.out.println("System.identityHashCode(math) = " + System.identityHashCode(math));
//        System.out.println("main: math = " + math + ", society = " + society);
//
//        addHomework(math, society);
//        System.out.println("main: math = " + math + ", society = " + society);

        Students elio = new Students(70, 90);
        System.out.println("elio = " + elio);

        addHomework(elio);
        System.out.println("elio.math = " + elio.literature);
    }

    private static void addHomework(Students student) {
//        math = math.intValue() + 10;
//        society = society.intValue() + 5;
//        System.out.println("System.identityHashCode(math) = " + System.identityHashCode(math));
//        System.out.println("addHomeWork: math = " + math + ", society = " + society);

        student.literature += 30;
        System.out.println("student.math = " + student.literature);
        System.out.println(student);
    }
}
