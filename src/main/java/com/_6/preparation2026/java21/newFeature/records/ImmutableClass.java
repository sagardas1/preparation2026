package com._6.preparation2026.java21.newFeature.records;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ImmutableClass {

    final List<String> list;

    public  ImmutableClass(List<String> list) {
        List<String> list1=new ArrayList<>();

//        for (String str:list){
//            list1.add(str);
//        }
//        this.list=list1;
       this.list= List.copyOf(new ArrayList<>(list));
      // this.list= Collections.unmodifiableList(new ArrayList<>(list));
    }
    List<String> getList(){

        return list;
    }
}
