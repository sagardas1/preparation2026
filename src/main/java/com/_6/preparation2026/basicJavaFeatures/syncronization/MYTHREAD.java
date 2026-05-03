package com._6.preparation2026.basicJavaFeatures.syncronization;

public class MYTHREAD extends Thread{

    Display display;
    String name;

    public MYTHREAD(Display display, String name) {
        this.display = display;
        this.name = name;
    }

    @Override
    public void run() {
        display.with(name);
    }
}
