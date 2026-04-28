package com._6.preparation2026.java21.newFeature.records;

import java.util.List;

public record RecordClass(List<String> name) {




   public RecordClass {
       if (name.isEmpty()){
           throw new NullPointerException();
       }
   }
    public String getList(String names) {
       String s= "";
       for (String i: name){
           s+=i;
       }
       return s;
    }
}
