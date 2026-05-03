package com._6.preparation2026.basicJavaFeatures;
interface a{
    void m1();
    default void m2(){
        System.out.println("a");
    }
}
interface b{
    void m1();

    default void m2(){
        System.out.println("b");
    }
}
public class d implements a,b {

    @Override
    public void m1() {
        System.out.println("main");
    }

    @Override
    public void m2() {
        b.super.m2();
    }


    public static void main(String[] args) throws InterruptedException {
        a a=new d();
        a.m1();
        a.wait();
        a.m2();
        try {
            b b = new d();
            b.m1();
            b.m2();
        }catch (Exception e){

        }finally {

        }


    }
}
