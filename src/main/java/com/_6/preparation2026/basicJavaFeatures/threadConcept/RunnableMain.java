package com._6.preparation2026.basicJavaFeatures.threadConcept;

public class RunnableMain {
    public static void main(String[] args) {

        MyRunnable  runnable = new MyRunnable();
        Thread thread = new Thread(new ThreadGroup("CHILD"),runnable);
        thread.start();

        for (int i=0;i<100;i++){
            System.out.println("["+Thread.currentThread().getName()+ "]-[-[MAIN THREAD]-]"+i);
        }
    }
}
