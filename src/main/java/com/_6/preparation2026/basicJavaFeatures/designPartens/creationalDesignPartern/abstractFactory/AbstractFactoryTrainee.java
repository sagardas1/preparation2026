package com._6.preparation2026.basicJavaFeatures.designPartens.creationalDesignPartern.abstractFactory;

public class AbstractFactoryTrainee implements AbstractFactoryInterface{

    @Override
    public Profession getProfession(String name) {
        if (name.equals("Doctor"))
            return new TraineeDoctor();
        else if (name.equals("Teacher"))
            return new TraineeTeacher();
        else return null;
    }
}
