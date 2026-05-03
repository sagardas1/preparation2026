package com._6.preparation2026.basicJavaFeatures.completableFuture;

public class FutureClass {

    public String futureFirstName() {
        System.out.println("Thread executed by :"+ Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "FutureFirstName";
    }

    public String futureLatName() {
        try {
            System.out.println("Thread executed by :"+Thread.currentThread().getName());
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "FutureLastName";
    }

}
