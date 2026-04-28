package com._6.preparation2026.basicJavaFeatures;

import org.springframework.beans.NullValueInNestedPathException;

import java.io.IOException;

public class Child extends Parent {

    @Override
     void A()throws NullPointerException , IOException {    // it can be default, protected, public as parent is default
        System.out.println("Child A");

    }

    @Override
    protected void B() throws IndexOutOfBoundsException{ // it can be protected and public as parent is protected
        System.out.println("Child B");

    }

    @Override
     public void C()  throws ArithmeticException ,  ClassNotFoundException{ // it can be public as parent is Public
        System.out.println("Child C");

    }
}
