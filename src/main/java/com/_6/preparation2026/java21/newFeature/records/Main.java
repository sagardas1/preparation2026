package com._6.preparation2026.java21.newFeature.records;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person =new Person("Sagar","8908273414","UKN BELVISTA");
        PersonRecord personRecord=new PersonRecord("Sagar","8908273414","UKN BELVISTA", new Human("People"));

        System.out.println(person.getAddress());
        System.out.println(personRecord.address());
        personRecord.human().setSpiceies("Animal");
        System.out.println(personRecord.human().getSpiceies());
        System.out.println(personRecord);
        List<String> list =new ArrayList<>();
        list.add("sagar");
        RecordClass recordClass=new RecordClass(list);

        ImmutableClass immutableClass=new ImmutableClass(list);


        list.add("Das");
        System.out.println(recordClass.name());
        System.out.println(immutableClass.getList());
    }

}


/**
 * Records are immutable
 * No setters
 */