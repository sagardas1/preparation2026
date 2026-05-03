package com._6.preparation2026.basicJavaFeatures.designPartens.creationalDesignPartern.abstractFactory;

public class AbstractFactoryExperienced implements AbstractFactoryInterface {

    @Override
    public Profession getProfession(String name) {
        if (name.equals("Doctor")) return new Doctor();
        else if (name.equals("Teacher")) return new Teacher();
        else return null;
    }
}
