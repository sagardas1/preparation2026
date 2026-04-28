package com._6.preparation2026.java8Features;

import java.util.List;
import java.util.function.Consumer;

public class LambdaExpressions {

    public static void main(String[] args) {
        FuntionalInterface1 funtionalInterface1 = (x, y) -> x * y;
        System.out.println( funtionalInterface1.sum(2,2));

        printSum(10);
        Consumer<List<Integer>> modify = list ->
        {
            for (int i = 0; i < list.size(); i++)
                list.set(i, 2 * list.get(i));
        };


    }

    private static void printSum(int a) {
        final int w = a;
        int k;
        Runnable runnable = () -> {
            int sum = 0;
            for (int i = 0; i <= w; i++) {
                sum = sum + i;
            }
            System.out.println(sum);
        };
        runnable.run();
    }
}
