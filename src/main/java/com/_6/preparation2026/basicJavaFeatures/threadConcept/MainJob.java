package com._6.preparation2026.basicJavaFeatures.threadConcept;

public class MainJob {
    public static void main(String[] args) {
        MyNewThread myNewThread = new MyNewThread();
        myNewThread.setPriority(10);
        myNewThread.start();

        for (int i=0;i<100;i++){
            System.out.println("[-[RUN BY MAIN THREAD]-]"+i);
        }

    }
}
