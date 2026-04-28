package com._6.preparation2026.java8InterviewCodingQuestions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.stream;

public class CodingQuestion {
    public static void main(String[] args) {
        int[] a= {1,2,3,4,5,6,7,8,9,10};

        stream(a).boxed().filter(p->p%2==0).forEach(p-> System.out.println(p));

        stream(a).boxed().map(p->p+"").filter(p->p.charAt(0)=='1').forEach(p->System.out.println(p));
        Set<Integer> set =new HashSet<>();
        stream(a).boxed().filter(p->!set.add(p)).forEach(p->System.out.println(p));
        List<Integer> list = List.of(1,2,3,4,5,6,7,7,8,9,10,1);

        stream(a).boxed().filter(p->list.indexOf(p)!=list.lastIndexOf(p)).forEach(p->System.out.println(p));
        Set<Integer> set1 =new HashSet<>();
        stream(a).boxed().filter(p->set1.add(p)).forEach(p->System.out.println(p));

        System.out.println(stream(a).boxed().findFirst().get());

        System.out.println(stream(a).boxed().count());

        System.out.println(stream(a).boxed().sorted(Comparator.reverseOrder()).findFirst().get());
        String s= "sagar";
        System.out.println(s.chars().mapToObj(p->(char)p).collect(Collectors.groupingBy(p->p,  LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(p->p.getValue()==1).map(p->p.getKey()).findFirst());


        System.out.println(s.chars().mapToObj(p->(char)p).collect(Collectors.groupingBy(p->p, LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(p->p.getValue()>1).map(p->p.getKey()).findFirst().get());



        int arr[]= {54,656,232,342,656,2,265,2327,6};
        Arrays.stream(arr).boxed().sorted().forEach(p->System.out.println(p));

        Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).forEach(p->System.out.println(p));
    }


}
