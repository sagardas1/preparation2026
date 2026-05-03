package com._6.preparation2026.java8InterviewCodingQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class CodingQuestion3 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10,1,3,4,5};

        Arrays.stream(a).boxed().filter(p->p%2 ==0).forEach(x->System.out.println(x));
        System.out.println("-------------------------");
        Arrays.stream(a).boxed().map(p->p+"").filter(p->p.charAt(0)=='1').forEach(p->System.out.println(p));
        System.out.println("-------------------------");
        Arrays.stream(a).boxed().collect(Collectors.groupingBy(p->p, Collectors.counting())).entrySet().stream().filter(p->p.getValue()>1).map(p->p.getKey()).forEach(p->System.out.println(p));
        System.out.println("-------------------------");
        System.out.println(Arrays.stream(a).boxed().findFirst().get());
        System.out.println("-------------------------");
        System.out.println(Arrays.stream(a).count());
        System.out.println("-------------------------");
        System.out.println(Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).findFirst().get());
        System.out.println("-------------------------");
        String s= "Sagarkagsr";
        System.out.println(Arrays.stream(s.split("")).collect(Collectors.groupingBy(p->p, LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(p->p.getValue()==1).map(p->p.getKey()).findFirst().get());
        System.out.println("-------------------------");
        System.out.println(s.chars().mapToObj(p->(char)p).collect(Collectors.groupingBy(p->p, LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(p->p.getValue()>1).map(p->p.getKey()).findFirst().get());
        System.out.println("-------------------------");
        Arrays.stream(a).boxed().sorted().forEach(p->System.out.println(p));
        System.out.println("-------------------------");
        Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).forEach(p->System.out.println(p));
    }
}
