package com._6.preparation2026.basicJavaFeatures.threadConcept.yeildConcept;

public class MyThread1 extends Thread{
    public void run(){
        for (int i=0;i<100;i++){
            System.out.println("[-[RUN BY CHILD THREAD]-]"+i);
            Thread.yield();
        }
    }
}
