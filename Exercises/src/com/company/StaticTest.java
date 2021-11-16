package com.company;

public class StaticTest {
    int classAttr;
    static int staticAttr;

    void classStart() {
        int a;
        System.out.println(classAttr);
    }

    static void staticStart() {
        int a;
        System.out.println(staticAttr);
    }

    public static void main(String[] args) {

        StaticTest.staticStart();
        StaticTest.staticAttr = 10;
        System.out.println(staticAttr);

        StaticTest staticVar = new StaticTest();
        staticVar.classStart();
        staticVar.classAttr = 10;
        System.out.println(staticVar.classAttr);
    }
}
