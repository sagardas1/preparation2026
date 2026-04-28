package com._6.preparation2026.basicJavaFeatures;

import com._6.preparation2026.java21.newFeature.records.ImmutableClass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        List<Integer> list =new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        MyImmutableClass myImmutableClass=new MyImmutableClass(list,"Sagar");
        list.add(50);

        System.out.println(myImmutableClass.getNumbers());
        System.out.println(myImmutableClass.getName());

        MySingletonClass instance =MySingletonClass.getInstance();
        MySingletonClass instance1 =MySingletonClass.getInstance();
        MySingletonClass instance3 =MySingletonClass.getInstance();

        System.out.println(instance);
        System.out.println(instance1);
        System.out.println(instance3);

        //UPCASTING
    P p =new C();
    p.m1(); // invoke child class method
    p.m2(); // invoke parent class method
    //p.m3(); // compile time error


        System.out.println("----------------------");
        //DOWNCASTING
        P p1 =new C();
        C c=new C(p1);

        c.m1();
        c.m2();
        c.m3();




    }
}
