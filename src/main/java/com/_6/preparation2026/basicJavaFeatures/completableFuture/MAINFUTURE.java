package com._6.preparation2026.basicJavaFeatures.completableFuture;

import java.util.concurrent.*;

public class MAINFUTURE {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        long start = System.currentTimeMillis();



        ExecutorService ex = Executors.newFixedThreadPool(2);

        Callable<String> callable1 = new  Callable(){
            @Override
            public String call() throws Exception {
                FutureClass futureClass = new FutureClass();
                return futureClass.futureFirstName();
            }
        };

        Callable<String> callable2 = new  Callable(){
            @Override
            public String call() throws Exception {

                FutureClass futureClass = new FutureClass();
                return futureClass.futureLatName();
            }
        };

        Future f1 = ex.submit(callable1);
        Future f2 = ex.submit(callable2);
        System.out.println(f1.get()+" "+f2.get());
        System.out.println("Time taken to execute :"+ (System.currentTimeMillis()-start));




    }
}
