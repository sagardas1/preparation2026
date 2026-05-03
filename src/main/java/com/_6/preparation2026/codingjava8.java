package com._6.preparation2026;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class codingjava8 {

    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10,5, 3};

        Arrays.stream(a).boxed().filter(p->p%2==0).forEach(x->System.out.println(x));
        System.out.println("----------------");
        Arrays.stream(a).boxed().map(p->p+"").filter(p->p.charAt(0)=='1').forEach(x->System.out.println(x));
        System.out.println("----------------");
        Arrays.stream(a).boxed().collect(Collectors.groupingBy(p->p,Collectors.counting())).entrySet().stream().filter(p->p.getValue()>1).map(p->p.getKey()).forEach(p->System.out.println(p));
        System.out.println("----------------");
        System.out.println(Arrays.stream(a).boxed().findFirst().get());
        System.out.println("----------------");
        System.out.println(Arrays.stream(a).boxed().count());
        System.out.println("----------------");
        System.out.println(Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).findFirst().get());
        System.out.println("----------------");
        System.out.println(Arrays.stream(a).boxed().collect(Collectors.groupingBy(p->p, LinkedHashMap::new,Collectors.counting())).entrySet().stream().map(p->p.getKey()).findFirst().get());
        System.out.println("---------------");
        System.out.println(Arrays.stream(a).boxed().collect(Collectors.groupingBy(p->p,LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(p->p.getValue()>1).map(p->p.getKey())
                .findFirst().get());
        System.out.println("----------------");
        Arrays.stream(a).boxed().sorted().forEach(p->System.out.println(p));
        System.out.println("---------------");
        Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).forEach(p->System.out.println(p));
        System.out.println("----------------");
        Set<Integer> set =new HashSet();
        Arrays.stream(a).boxed().map(x->set.add(x));
        if(set.size()!=a.length){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        System.out.println("----------------");
        LocalDateTime d= LocalDateTime.now();
        System.out.println(d);
        System.out.println("---------------");
        Stream<Integer> s1= Arrays.stream(a).boxed();
        Stream<Integer> s2= Arrays.stream(a).boxed();
        Stream<Integer> s3 = Stream.concat(s1,s2);
        s3.forEach(System.out::println);
        System.out.println("---------------");



        List<Integer> list= List.of(1,2,3,4,5,6,67);
        Stream<Integer> stream = list.stream();

        stream.forEach(System.out::println);
        System.out.println("---------------");
        Arrays.stream(a).boxed().map(p->p*p*p).filter(p->p>50).forEach(p->System.out.println(p));

        Arrays.parallelSort(a);
        Arrays.stream(a).forEach(System.out::println);
        System.out.println("---------------");
        String s[]= {"sagar","das","sagar"};
        Arrays.stream(s).map(p->p.toUpperCase()).forEach(x->System.out.println(x));
        System.out.println("---------------");
        Arrays.stream(s).collect(Collectors.groupingBy(p->p,Collectors.counting())).entrySet().stream().forEach(x->System.out.println(x.getKey()+" "+x.getValue()));
        System.out.println("---------------");

        Arrays.stream(s).collect(Collectors.groupingBy(p->p,Collectors.counting())).entrySet().stream().filter(p->p.getValue()>1).forEach(p->System.out.println(p));

        System.out.println("---------------");
        List<Integer> list1= null;
        Optional.ofNullable(list1).orElseGet(()->new ArrayList<>()).stream().forEach(p->System.out.println(p));
        System.out.println("---------------");

        String str= "Sagar";

        str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(p->p,Collectors.counting())).entrySet().stream().forEach(x->System.out.println(x.getKey()+" "+x.getValue()));
        System.out.println("---------------");

        str.chars().mapToObj(c->((char) c+"".toUpperCase())).collect(Collectors.groupingBy(p->p,Collectors.counting())).entrySet().stream().filter(p->p.getValue()>1).map(p->p.getKey()).forEach(x->System.out.println(x));
        System.out.println("---------------");
        System.out.println(Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());
    }
}
