package com._6.preparation2026.java8.coding;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainExecution {
    public static void main(String[] args) {

        Employee e1 =new Employee(1,"sagar",new Salary(100000,"$"));
        Employee e2=new Employee(2,"lion",new Salary(9000,"$"));
        Employee e3=new Employee(3,"alpha",new Salary(10000,"$"));
        Employee e4=new Employee(4,"bravo",new Salary(10000,"Rupees"));
        Employee e5=new Employee(5,"charlie",new Salary(10000,"Rupees"));
        Employee e6=new Employee(6,"sagar",new Salary(600,"$"));
        Employee e7=new Employee(7,"alex",new Salary(10000,"$"));

        List<Employee> employees=new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);
        employees.add(e7);

        employees.stream().filter(p->p.salary.currency.equals("$"))
                .sorted(
                        Comparator.comparing((Employee e)-> e.name)
                                .thenComparing(
                                Comparator.comparing((Employee e)->e.salary.salary).reversed()
                        )
                ).forEach(x-> System.out.println("ID: "+x.id+" Name: "+x.name+" Salary: "+x.salary.salary+" Currency: "+x.salary.currency));

        employees.stream().filter(p->p.salary.currency.equals("$")).sorted(
                Comparator.comparing( (Employee e) -> e.name).thenComparing(
                        Comparator.comparing((Employee p)->p.salary.salary).reversed())
        ).forEach(x->System.out.println("ID: "+x.id+" Name: "+x.name+" Salary: "+x.salary.salary+" Currency: "+x.salary.currency));

       // only show who are earnings in dollors , sort by name in acse order, if name is same then sort by salary desc order



        String s="sagar";

        s.chars().mapToObj(c->(char)c).findFirst().get();
        Arrays.stream(s.split("")).findFirst().get();
        employees.stream().filter(p -> p.salary.currency.equals("$"))
                .sorted(
                Comparator.comparing((Employee p) -> p.name).thenComparing(
                        Comparator.comparing((Employee p) -> p.salary.salary).reversed()
                )
        ).forEach(x -> System.out.println(x.id + " " + x.name + " " + x.salary.currency + " " + x.salary.salary));

//        Objectives ::
//                1. only need which are earning in "$"
//                2. Sort them with name (aesc), if name are same then  sort them with desc order of there salary
//                and print them
//


        employees.stream().filter(p -> p.salary.currency.equals("$"))
                .sorted(
                        Comparator.comparing((Employee p)  -> p.name).thenComparing(
                                Comparator.comparing((Employee e)  -> e.salary.salary).reversed()
                        )
                ).forEach(x -> System.out.println(x.id + " " + x.name + " " + x.salary.currency + " " + x.salary.salary));

        employees.stream().filter(p -> p.salary.currency.equals("$"))
                .sorted(
                Comparator.comparing((Employee p) -> p.name).thenComparing(
                            Comparator.comparing((Employee p)->p.salary.salary).reversed()
                )
        ).forEach(x->System.out.println(x.name));

    }
}
