package com._6.preparation2026.basicJavaFeatures.completableFuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {

    public String getName(){
        System.out.println("Thread executed by :"+Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "Sagar Das";

    }
    public String getAddress(){
        System.out.println("Thread executed by :"+Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "UKN BELVISTA";

    }
    public static void main(String[] args) {

        System.out.println("Thread executed by :"+Thread.currentThread().getName());
      CompletableFuture<String> c1=  CompletableFuture.supplyAsync(() -> new CompletableFutureDemo().getName());
        CompletableFuture<String> c2=  CompletableFuture.supplyAsync(() -> new CompletableFutureDemo().getAddress());

c1.thenCombine(c2, (s1,s2)->"MR "+s1+" ADDRESS : "+ s2)

                .thenApply(p-> p)
                .thenAccept(x -> System.out.println(x));
        System.out.println("done");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
