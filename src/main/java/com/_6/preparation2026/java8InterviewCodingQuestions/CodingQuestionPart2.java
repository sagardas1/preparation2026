package com._6.preparation2026.java8InterviewCodingQuestions;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CodingQuestionPart2 {



    public int[] twoSum(int[] nums, int target) {



        int[] x =new int[2];

        for(int i =0;i<nums.length;i++){
            for (int j =i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    x[0]=i;
                    x[1]=j;
                }
            }
        }





        return x;
    }

    public static int lengthOfLongestSubstring(String s) {

        if (s.length()==1) return 1;
        if (s.length()==0)return 0;

        List<String> list=new ArrayList<>();
        String l ="";

        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if (l.contains(s.charAt(j)+"")){
                    list.add(l);
                    l="";
                    break;

                }else {
                    l += s.charAt(j);
                }

            }
        }

        return list.stream().sorted(Comparator.comparingInt(String::length).reversed()).findFirst().get().length();




    }
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("aa"));

//
//        String a= "iFollowMilindMehta";
//
//
//
//        a.chars().mapToObj(p-> (char)p).collect(Collectors.groupingBy(p->p,Collectors.counting())).entrySet().stream().forEach(p-> System.out.println(p.getKey()+" -> "+p.getValue()));
//
//        System.out.println("------------");
//        Arrays.stream(a.split("")).collect(Collectors.groupingBy(p->p, Collectors.counting())).entrySet().stream().filter(p->p.getValue()>1).forEach(p->System.out.println(p.getKey()+" -> "+p.getValue()));
//
//        System.out.println("------------");
//        System.out.println(a.chars().mapToObj(p->(char)p).collect(Collectors.groupingBy(p->p, LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(p->p.getValue()==1).map(p->p.getKey()).findFirst().get());
//
//        int arr[] = {5,8,2,13,42,56,24,36};
//
//        System.out.println("------------");
//        System.out.println(Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());
//
//
//        String str[] = {"Milind","Mehta","follow","java8","Microservice","Springboot"};
//
//     Map.Entry<String,Integer> map = Arrays.stream(str)
//              .collect(Collectors.toMap(p->p,p->p.length()))
//              .entrySet()
//              .stream()
//              .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//              .collect(Collectors.toMap(p->p.getKey(), p->p.getValue(), (i1,i2) ->i1, LinkedHashMap::new))
//              .entrySet().stream()
//              .findFirst()
//              .get();
//
//
//        System.out.println(map.getKey());
//
//        int x[] = {1,2,11,21,31,42,56,23,16};
//
//        Arrays.stream(x).boxed().map(p->p+"").filter(p->p.charAt(0) == '1').forEach(p->System.out.println(p));
//        System.out.println(Arrays.stream(x).sum());
//        Arrays.stream(x).sorted(Comparator.comparing(p->p,p->p).reversed()).findFirst().ifPresent(System.out::println);
//
//        Arrays.stream(x).boxed()
//                .sorted(Comparator.reverseOrder())
//                .findFirst()
//                .ifPresent(System.out::println);
    }
}
