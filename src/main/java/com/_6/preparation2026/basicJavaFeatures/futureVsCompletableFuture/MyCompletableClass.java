package com._6.preparation2026.basicJavaFeatures.futureVsCompletableFuture;

import java.util.concurrent.CompletableFuture;

public class MyCompletableClass {
    public String getName()  {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "SAGAR DAS";
    }
    public String getAddress(){
        try {
             Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "UKN BELVISTA";
    }

    public static void main(String[] args) {
        MyCompletableClass myCompletableClass = new MyCompletableClass();
        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> myCompletableClass.getName());
        CompletableFuture<String> f2 = CompletableFuture.supplyAsync(() -> myCompletableClass.getAddress());

        f1.thenCombine(f2, (x, y) -> x + "[--]" + y).exceptionally(x -> String.valueOf(new Exception("bvbshjvbhjd"))).thenAccept(p -> System.out.println(p));
        System.out.println("MAIN");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
