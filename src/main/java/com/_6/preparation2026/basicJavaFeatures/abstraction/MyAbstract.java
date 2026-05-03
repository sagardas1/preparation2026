package com._6.preparation2026.basicJavaFeatures.abstraction;

public abstract class MyAbstract {

    int a ;
    int b;

    MyAbstract(int a, int b) {
this.a=a;
this.b=b;
    }
    MyAbstract() {}

    public void m1(){
        System.out.println("Inside m1 abstarct class");
    }

    public abstract void m2();
}
