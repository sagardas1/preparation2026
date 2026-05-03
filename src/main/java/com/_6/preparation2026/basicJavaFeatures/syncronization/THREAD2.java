package com._6.preparation2026.basicJavaFeatures.syncronization;

public class THREAD2 extends Thread {

    Display display;
    String name;

    public THREAD2(Display display, String name) {
        this.display = display;
        this.name = name;
    }

    @Override
    public void run() {
        display.withNon1(name);
    }
}
