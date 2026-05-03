package com._6.preparation2026.revision;

public class MainClass {
    public static void main(String[] args) {
        ClassA classA = new ClassB();

        classA.m1(); // child class method
        classA.m2();// parent class method
        //classA.m3() //compilstion error

        ClassB classB = (ClassB) classA;
        classB.m1(); // child class method;
        classB.m2();// parent class method;
        classB.m3(); //child class method

    }
}
