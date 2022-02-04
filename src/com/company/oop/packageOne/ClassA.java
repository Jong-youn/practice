package com.company.oop.packageOne;

public class ClassA {

    private int pri;
    int def;
    protected int pro;
    public int pub;

    private static int priStatic;
    static int defStatic;
    protected static int proStatic;
    public static int pubStatic;

    // 인스턴스 메서드
    void runSomething() {
        System.out.println("Run Something");

        pri = 1;
        this.pri = 1;
        def = 1;
        this.def = 1;
        pro = 1;
        this.pro = 1;
        pub = 1;
        this.pub = 1;

        // 정적 멤버는 클래스명.정적멤버 형태의 접근을 권장
        ClassA.priStatic = 1;
        priStatic = 1;
        this.priStatic = 1;
        ClassA.defStatic = 1;
        defStatic = 1;
        this.defStatic = 1;
        ClassA.proStatic = 1;
        proStatic = 1;
        this.proStatic = 1;
        ClassA.pubStatic = 1;
        pubStatic = 1;
        this.pubStatic = 1;
    }

    // 클래스 메서드
    static void runStaticThing() {
        System.out.println("Run > Static < Something");

        // 클래스 변수는 인스턴스 변수에 접근 불가
        // pri = 1; this.pri = 1;
        // def = 1; this.def = 1;
        // pro = 1; this.pro = 1;
        // pub = 1; this.pub = 1;

        // 정적 멤버는 클래스명.정적멤버 형태의 접근을 권장
        // this로 접근이 안되는데 this는 인스턴스 자신을 가리키는 용어다
        ClassA.priStatic = 1;
        priStatic = 1; // this.priStatic = 1;
        ClassA.defStatic = 1;
        defStatic = 1; // this.defStatic = 1;
        ClassA.proStatic = 1;
        proStatic = 1; // this.proStatic = 1;
        ClassA.pubStatic = 1;
        pubStatic = 1; // this.pubStatic = 1;

        ClassA ca = new ClassA();
        ca.pri = 1;
        ca.def = 1;
        ca.pro = 1;
        ca.pub = 1;

        // 객체 참조 변수를 통해 정적 멤버도 접근 가능, 권장하지는 않음
        ca.priStatic = 1;
        ca.defStatic = 1;
        ca.proStatic = 1;
        ca.pubStatic = 1;
    }
}
