package com._6.preparation2026.basicJavaFeatures.threadConcept;

public class MyNewThread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println("[-[RUN BY CHILD THREAD]-]"+i);
        }
    }
}
