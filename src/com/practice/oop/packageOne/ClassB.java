package com.practice.oop.packageOne;

public class ClassB {
    void runSomething() {
        // 상속을 받지 않았기에 ClassA 의 객체 멤버는 객체 생성 후에 접근 가능
        //pri = 1;	this.pri = 1;
        //def = 1;	this.def = 1;
        //pro = 1;	this.pro = 1;
        //pub = 1;	this.pub = 1;

        // 정적 멤버는 클래스명.정적멤버 형태의 접근을 권장
        //ClassA.priStatic = 1;	//priStatic = 1;	this.priStatic = 1;
        ClassA.defStatic = 1;	//defStatic = 1;	this.defStatic = 1;
        ClassA.proStatic = 1;	//proStatic = 1;	this.proStatic = 1;
        ClassA.pubStatic = 1;	//pubStatic = 1;	this.pubStatic = 1;

        // 객체 멤버를 객체 생성 후에 객체 참조 변수를 통해 접근 가능
        ClassA ca = new ClassA();
        //ca.pri = 1;
        ca.def = 1;
        ca.pro = 1;
        ca.pub = 1;
    }

    static void runStaticThing() {
        // 인스턴스 멤버
        // 1. static -> instance (x) 2. 상속받지 않음
        //pri = 1;	this.pri = 1;
        //def = 1;	this.def = 1;
        //pro = 1;	this.pro = 1;
        //pub = 1;	this.pub = 1;

        // 클래스 멤버
        // 정적 멤버는 클래스명.정적멤버 형태의 접근을 권장
        // 상속받지 않아 그냥은 접근 안됨
        //ClassA.priStatic = 1;	//priStatic = 1;	//this.priStatic = 1;
        ClassA.defStatic = 1;	//defStatic = 1;	//this.defStatic = 1;
        ClassA.proStatic = 1;	//proStatic = 1;	//this.proStatic = 1;
        ClassA.pubStatic = 1;	//pubStatic = 1;	//this.pubStatic = 1;

        // 객체 생성. 객체를 통해 인스턴스 멤버 접근
        // 객체 멤버를 객체 생성 후에 객체 참조 변수를 통해 접근 가능
        ClassA ca = new ClassA();
        //ca.pri = 1;
        ca.def = 1;
        ca.pro = 1;
        ca.pub = 1;

        // 객체 생성. 객체를 통해 클래스 멤버 접근
        // 객체 참조 변수를 통해 정적 멤버도 접근 가능, 권장하지는 않음
        //ca.priStatic = 1;
        ca.defStatic = 1;
        ca.proStatic = 1;
        ca.pubStatic = 1;
    }
}
