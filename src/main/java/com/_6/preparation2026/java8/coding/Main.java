package com._6.preparation2026.java8.coding;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Employee    employee=new Employee(1,"",null);

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 100);

        List<Integer> l = list.parallelStream().map(p -> {
            System.out.println(p + "--->>>" + Thread.currentThread().getName());
            p = p * 2;
            return p;
        }).toList();

        for (Integer i : l) {
            System.out.println(i);
        }
    }


}
