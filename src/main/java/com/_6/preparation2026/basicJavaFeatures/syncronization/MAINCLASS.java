package com._6.preparation2026.basicJavaFeatures.syncronization;

public class MAINCLASS {
    public static void main(String[] args) {
        Display display = new Display();
        MYTHREAD  t1=new MYTHREAD(display,"ABC");
        MYTHREAD  t2=new MYTHREAD(display,"DEF");
        THREAD2    t3=new THREAD2(display,"ALEX");
        t1.start();
        t2.start();
        t3.start();

        display.withNon("MAIN");
    }
}
