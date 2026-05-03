package com._6.preparation2026.basicJavaFeatures.designPartens.creationalDesignPartern.abstractFactory;


public class AbstractFactoryGetType {
    public static AbstractFactoryInterface getFactoryIsTrainee(boolean isTainee){
        if(isTainee){
            return new AbstractFactoryTrainee();
        }
        else return new AbstractFactoryExperienced();
    }
}
