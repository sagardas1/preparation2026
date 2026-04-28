package com._6.preparation2026.java21.newFeature.PATTERNMATCHING;

public class SwitchCase {
    public static void main(String[] args) {
        String s = "Lion";

        oldWaySwitch(s);
        newWaySwitch(s);
    }

    private static void newWaySwitch(String s) {
        switch (s) {
            case "Sagar" -> System.out.println("SWITH TO SAGAR");
            case "Lion" -> System.out.println("SWITH TO LION");
            case "Alpha" -> System.out.println("SWITH TO ALPHA");
            default -> System.out.println("SWITH TO OTHER");
        }
    }

    private static void oldWaySwitch(String s) {
        switch (s) {
            case "Sagar":
                System.out.println("SWITH TO SAGAR");
                break;
            case "Lion":
                System.out.println("SWITH TO LION");
               break;
            case "Alpha":
                System.out.println("SWITH TO ALPHA");
               break;
            default:
                System.out.println("SWITCH NOTHING");
                break;
        }
    }


}
