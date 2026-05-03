package com._6.preparation2026.basicJavaFeatures.syncronization;

public class Display {

    public synchronized void with(String name)  {
        for (int i = 0; i < 10; i++) {
            System.out.println("In Display with:" + name);
            try {
                Thread.sleep(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }

    public synchronized void withNon(String name)  {
        for (int i = 0; i < 10; i++) {
            System.out.println("In Display with:" +i +" " +name);

        }
    }
    public  void withNon1(String name)  {
        for (int i = 0; i < 10; i++) {
            System.out.println("In Display with:" +i +" " +name);

        }
    }
}
