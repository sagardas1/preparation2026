package com._6.preparation2026.java21.newFeature.RandomGenerator;

import java.util.random.RandomGenerator;

public class RandomNumber {
    public static void main(String[] args) {
        RandomGenerator  randomGenerator = RandomGenerator.of("L128X256MixRandom");
        System.out.println(randomGenerator.nextInt(1));
    }
}
