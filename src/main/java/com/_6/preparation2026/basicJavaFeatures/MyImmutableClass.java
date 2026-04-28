package com._6.preparation2026.basicJavaFeatures;

import java.util.ArrayList;
import java.util.List;

public final class MyImmutableClass {

    private final List<Integer> numbers;
    private final String name;

    MyImmutableClass(List<Integer> numbers, String name) {
        this.numbers = new ArrayList<>(numbers);
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public List<Integer> getNumbers() {
        return numbers;
    }
}
