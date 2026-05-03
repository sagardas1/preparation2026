package com._6.preparation2026.java8InterviewCodingQuestions;

import java.sql.SQLOutput;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collector;
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


        int i[] ={1,2,3,4};
       List list2 =  Arrays.stream(i).boxed().collect(Collectors.groupingBy(p->p, Collectors.counting())).entrySet().stream().filter(p->p.getValue()>=2).map(p->p.getKey()).toList();
         if (list2.size()>=1){
             System.out.println(true);
         }else{
             System.out.println(false);
         }

        Arrays.stream(arr).boxed().map(p->p*p*p).filter(p->p>50).forEach(p->System.out.println(p));

        String[] names = {"Sagar", "Das", "Alpha", "Lion", "Das"};

        Arrays.stream(names).map(p -> p.toUpperCase()).forEach(p -> System.out.println(p));
        Arrays.stream(names).collect(Collectors.groupingBy(p->p, Collectors.counting())).entrySet().stream().forEach(p->System.out.println(p.getKey()+" -> " +p.getValue()));

        String id = "Sagar Das";

        id.chars().mapToObj(p->((char)p+"").toUpperCase()).collect(Collectors.groupingBy(p->p, LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(p->p.getValue()>1).forEach(p->System.out.println(p.getKey()+" - > "+p.getValue()));



        int[] maxNums = {12,19,20,88,00,9};

        System.out.println(Arrays.stream(maxNums).boxed().sorted(Comparator.reverseOrder()).findFirst().get());

        String r= "Sagar";


        r.chars().mapToObj(p->(char)p).collect(Collectors.groupingBy(p->p,Collectors.counting())).entrySet().stream().forEach(p->System.out.println(p.getKey()+" -> "+p.getValue()));


        System.out.println("----------------");
        String x1= "sagar";
                String x2 ="das";
        System.out.println(x1.hashCode());
        System.out.println(x2.hashCode());

        HashMap<String, Integer> map= new HashMap<>();
        map.put(x1,1);
        map.put(x2,2);
        System.out.println(map.get(x1));
        System.out.println(map.get(x2));



        HashMap<String, Integer> map1= new HashMap<>();

        map1.put(x1,1);
        map1.put(x2,2);
        map1.put(null,2);

        for (Map.Entry<String,Integer> entry: map.entrySet()){

            entry.getKey();
          // map.remove("1");
         //   map.put("s,3",1);

        }

        ConcurrentHashMap<String, Integer> cm= new ConcurrentHashMap<>();
        cm.put("sagar",1);
        cm.put("lion",2);
      //  cm.put(null,3);

        for (Map.Entry<String,Integer> entry: cm.entrySet()){
            entry.getKey();
            cm.put("alpha",3);
            cm.remove("lion");
        }

        Map<String, Integer> map4= Collections.synchronizedMap(new HashMap<>());
        map4.put("sagar",1);
        map4.put("lion",2);
        map4.put(null,3);

        ArrayList<String> list1= new ArrayList<>();
        list1.add("sagar");

        for(String x:list1){
            list1.add(x);
            list1.remove("sagar");
        }

        Iterator<String> iterator = list1.iterator();
       for(Iterator<String> iterator1=list1.iterator();iterator.hasNext();){
           iterator1.next();
           list1.add("jvdfjbnv");
       }
    }



}
