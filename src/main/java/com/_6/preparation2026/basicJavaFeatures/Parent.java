package com._6.preparation2026.basicJavaFeatures;

import java.io.IOException;

public class Parent {

    void A() throws IOException {
        System.out.println("Parent A");

    }

    protected void B() throws IOException{
        System.out.println("Parent B");
    }

    public void C() throws ClassNotFoundException{
        System.out.println("Parent C");
    }
}
