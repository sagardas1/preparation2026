package com._6.preparation2026.basicJavaFeatures.threadConcept.yeildConcept;

public class Main1 {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        thread1.start();
        for (int i=0;i<1000;i++){
            System.out.println("[-[RUN BY PARENT THREAD-1]-]"+i);
        }
    }
}
