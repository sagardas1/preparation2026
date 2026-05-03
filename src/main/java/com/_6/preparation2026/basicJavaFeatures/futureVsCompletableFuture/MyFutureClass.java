package com._6.preparation2026.basicJavaFeatures.futureVsCompletableFuture;

import java.util.concurrent.*;

public class MyFutureClass {

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

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        MyFutureClass myFutureClass = new MyFutureClass();

        ExecutorService ex = Executors.newFixedThreadPool(2);
        Callable<String> callable1 = () -> myFutureClass.getName();
        Callable<String> callable2 = () -> myFutureClass.getAddress();
        Future f1 = ex.submit(callable1);
        Future f2 = ex.submit(callable2);

        System.out.println(f1.get() + " [--] " + f2.get());
        System.out.println("MAIN");


    }
}
