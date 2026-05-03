package com._6.preparation2026.basicJavaFeatures.threadConcept.joinConcept;

public class MyMain2 {
    public static void main(String[] args) throws InterruptedException {
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();
        myThread2.join();
        for (int i = 1; i <= 10; i++) {
            System.out.println("[-[RUN BY MAIN THREAD]-]"+i);

        }
    }
}
