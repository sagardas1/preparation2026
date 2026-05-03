package com._6.preparation2026.basicJavaFeatures.designPartens.creationalDesignPartern.factoryDP;

public class FactoryPartenMainClass {
    public static void main(String[] args) {
        ProfessionFactory professionFactory = new ProfessionFactory();
        Profession p= professionFactory.getObject("ABC");
        p.print();
    }
}
