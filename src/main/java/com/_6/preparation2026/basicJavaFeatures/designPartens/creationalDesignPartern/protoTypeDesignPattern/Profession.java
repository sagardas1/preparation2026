package com._6.preparation2026.basicJavaFeatures.designPartens.creationalDesignPartern.protoTypeDesignPattern;

public abstract class Profession implements Cloneable {

    int id;
    int name;

    abstract void print();

    @Override
    public Object clone() {
       Object clone = null;
       try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {}
       return clone;
    }
}

