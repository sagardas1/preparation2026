package com._6.preparation2026.basicJavaFeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Coding {
    public static void main(String[] args) {
        int a[]= {0,1,0,2,3,-4,0,0,-5,0,6,0,0};
List<Integer> list=new ArrayList<>();
      List<Integer> list2=  Arrays.stream(a).boxed().map(p->{
            if (p==0){
                list.add(0);
            }
            return p;
        }).filter(p->p!=0).collect(Collectors.toList());

        Stream.concat(list2.stream(),list.stream()).forEach(System.out::println);
        System.out.println("--------------");

        int a1[]={1,2-12,-3,9,-3,90,-89,-67};

        Stream.concat(Arrays.stream(a1).boxed().filter(p->p<0),Arrays.stream(a1).boxed().filter(p->p>0)).forEach(System.out::println);
        System.out.println("--------------");
        String s="abca"; // isIsogram OR not

       List<Character> list5= s.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(p->p, Collectors.counting())).entrySet().stream().filter(p->p.getValue()==1).map(p->p.getKey()).collect(Collectors.toList());

       if (s.length()!=list5.size()){
            System.out.println(false);
        }else {
            System.out.println(true);
        }
        System.out.println("--------------");
        System.out.println(fib(9));

        System.out.println("--------------");
        System.out.println(get());
        System.out.println("--------------");

        List<Integer> l=new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        for (Integer i:l){
            System.out.println(i);
            l.remove(1);
        }
        System.out.println("--------------");
        for (Integer i:l){
            System.out.println(i);

        }
        System.out.println("--------------");

        switch(s){
            case null:
                System.out.println("null");
            break;
            case "1":  System.out.println("null");
            break;
            case "2":  System.out.println("null");
            break;
            default:  System.out.println("null");

        };

    }

    public static int fib(int n){
        if (n<=1){
            return n;
        }try {

            return fib(n - 1) + fib(n - 2);
        }finally {

        }
    }

    public static int get(){
        try {
            int x = 0;
            try {

                return x;

            } finally {
                System.out.println("Finally");
                x = 2;
            }
        }catch (Exception e){}
        return 0;
    }





}
