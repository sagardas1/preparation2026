package com._6.preparation2026.java8InterviewCodingQuestions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static tools.jackson.databind.type.LogicalType.Array;

public class Program1 {
    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

       List<Integer> evenNumbers =  integerList.stream().filter(x->x%2==0).toList();
        System.out.println(evenNumbers);
        List<Integer> evenNumbers1 =  integerList.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println(evenNumbers1);
        List<Integer> evenNumbers2 =  integerList.stream().filter(x->x%2==0).collect(Collectors.toUnmodifiableList());
        System.out.println(evenNumbers2);

        int a[] = {1,2,3,4,5,6,7,8,9,10};

        Integer [] evenNumbers3 =  Arrays.stream(a).boxed().filter(p->p%2==0).toArray(Integer[]::new);
        Arrays.stream(a).boxed().filter(p->p%2==0).toList();
        Arrays.stream(a).boxed().filter(p->p%2==0).forEach(p-> System.out.println(p));

        System.out.println("--------------------");
        int[] integers={11,23,44,99,11,55,76,12,123,54,31,16,17,18,99,19};
        Arrays.stream(integers).boxed().map(p->p+"").filter(i->i.charAt(0)=='1').forEach(i-> System.out.println(i));

        System.out.println("--------------------");
        Set<Integer> set = new HashSet<>();
       Arrays.stream(integers).boxed().filter(p->!set.add(p)).forEach(p-> System.out.println(p));
        System.out.println("--------------------");
        Arrays.stream(integers).boxed().distinct().map(p->p*2).forEach(i-> System.out.println(i));
        System.out.println("--------------------");
        Arrays.stream(integers).boxed().findFirst().ifPresent(System.out::println);
        System.out.println("--------------------");
        System.out.println( Arrays.stream(integers).boxed().count());
        System.out.println("--------------------");
        System.out.println( integers.length);
        System.out.println("--------------------");
        int i=0;
        System.out.println(Arrays.stream(integers).boxed().sorted(Comparator.reverseOrder()).findFirst());
        System.out.println("--------------------");
        System.out.println( Arrays.stream(integers).boxed().min(Comparator.naturalOrder()));
        System.out.println("--------------------");
        String input = "sagar";


        System.out.println( input.chars().mapToObj(p->Character.toLowerCase((char)p))
                .collect(Collectors.groupingBy(p->p,LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(p->p.getValue()==1)
                .map(p->p.getKey()).findFirst().get());

        System.out.println(input.chars().mapToObj(p->Character.toLowerCase((char)p)).filter(p->input.indexOf(p)==input.lastIndexOf(p)).findFirst().get());
        System.out.println("--------------------");




        // to convert integers Arrays to list for streaming

        Arrays.stream(integers).boxed().forEach(p-> System.out.println(p));

        // to convert string to list for streaminh
        input.chars()
                .mapToObj(p -> (char) p)
                .findFirst();

       char c[]= {'a','b','c','d'};
        System.out.println("--------------------");
        System.out.println( String.valueOf(c).chars().mapToObj(p->(char)p)
                        .sorted(Comparator.reverseOrder())
               .findFirst().get());

        System.out.println(input.chars().mapToObj(p->(char)p).filter(p->input.indexOf(p)!=input.lastIndexOf(p)).findFirst().get());
        System.out.println("--------------------");

        System.out.println(input.chars().mapToObj(p->(char)p)
                .collect(Collectors.groupingBy(p->p,LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(p->p.getValue()>1)
                .map(p->p.getKey())
                .findFirst().get());

        System.out.println("--------------------");
 Arrays.stream(integers).boxed().sorted(Comparator.naturalOrder()).forEach(p-> System.out.println(p));

        System.out.println("--------------------");
        Arrays.stream(integers).boxed().sorted(Comparator.reverseOrder()).forEach(p-> System.out.println(p));

        System.out.println("--------------------");
        System.out.println(integers.length == Arrays.stream(integers).boxed().collect(Collectors.toSet()).size());

        List<Integer> list1 = List.of(1,2,3,4,5);
        List<Integer> list2 = List.of(6,7,8,9,10);

      Stream<Integer> s=  Stream.concat(list1.stream(), list2.stream());
      s.forEach(System.out::println);
        System.out.println("--------------------");
        List<Integer> integerList1 = Arrays.asList(4,5,6,7,1,2,3);
        integerList1.stream().map(p->p*p*p).filter(p->p>50).forEach(p-> System.out.println(p));

        int arr[] = { 99, 55, 203, 99, 4, 91 };

        Arrays.stream(arr).boxed().sorted().forEach(p-> System.out.println(p));
        List<Notes> noteLst = new ArrayList<>();
        noteLst.add(new Notes(1, "note1", 11));
        noteLst.add(new Notes(2, "note2", 22));
        noteLst.add(new Notes(3, "note3", 33));
        noteLst.add(new Notes(4, "note4", 44));
        noteLst.add(new Notes(5, "note5", 55));

        noteLst.add(new Notes(6, "note4", 66));

       Map<String,Integer> map =  noteLst.stream().collect(Collectors.toMap(p->p.name,p->p.numbers,(p1,p2)->p1,LinkedHashMap::new));

        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
        names.stream()
                .collect(Collectors.groupingBy(p->p,Collectors.counting()))
                .entrySet().stream()
                .forEach(p-> System.out.println(p.getKey()+" .  "+p.getValue()));
        System.out.println("--------------------");

      names.stream().collect(Collectors.groupingBy(p->p,Collectors.counting())).entrySet().stream().filter(p->p.getValue() >1).forEach(p-> System.out.println(p.getKey()+" .  "+p.getValue()));

    String name= "Sagar Das";

    name.chars().mapToObj(p->(char)p).collect(Collectors.groupingBy(p->p, Collectors.counting())).entrySet().stream().forEach(p-> System.out.println(p.getKey()+" .   "+p.getValue()));

        System.out.println("--------------------");
    Stream<Integer> stream= Stream.of(1, 2, 3, 4, 5);

        System.out.println("---------1st -----------");
        stream.forEach(p-> System.out.println(p));
        System.out.println("---------2nd-----------");
        stream.forEach(p-> System.out.println(p));

    }
}
