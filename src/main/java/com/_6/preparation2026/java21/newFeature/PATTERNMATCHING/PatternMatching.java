package com._6.preparation2026.java21.newFeature.PATTERNMATCHING;

public class PatternMatching {


    /**
     * Old way manually casting
     * @param obj
     * @return
     */
    public String checkType(Object obj) {

        if (obj instanceof String) {
            return "String " + (String) obj; //Must cast manually
        } else if (obj instanceof Integer) {
            return "Integer " + (Integer) obj;//Must cast manually
        } else if (obj instanceof Boolean) {
            return "Boolean " + (boolean) obj;//Must cast manually
        }

        return "";
    }

    /**
     * New way in java 17
     * there are some restrictions to it
     * its only work with reference type not primitive type
     * its not work with GENERIC TYPE
     *
     */
    public String checkTypeNew(Object obj) {

        return switch (obj) {
            case Integer i -> "Integer" + i;
            case Boolean b -> "Boolean" + b;
            case String s -> "String" + s;
            default -> "Unknown";
        };
    }

    public static void main(String[] args) {

        PatternMatching  patternMatching = new PatternMatching();
        System.out.printf(patternMatching.checkTypeNew(false));
    }

}

