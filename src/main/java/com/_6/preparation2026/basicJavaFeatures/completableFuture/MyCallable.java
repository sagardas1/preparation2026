package com._6.preparation2026.basicJavaFeatures.completableFuture;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

    FutureClass futureClass;

    public MyCallable(FutureClass futureClass) {
        this.futureClass = futureClass;
    }
    @Override
    public String call() throws Exception {
        return futureClass.futureLatName();
    }
}
