package com._6.preparation2026.basicJavaFeatures.designPartens.creationalDesignPartern.abstractFactory;

public class MAin {
    public static void main(String[] args) {
        AbstractFactoryInterface type = AbstractFactoryGetType.getFactoryIsTrainee(false);
        Profession p=type.getProfession("Doctor");
        p.print();


    }
}
