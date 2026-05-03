package com._6.preparation2026.basicJavaFeatures.designPartens.creationalDesignPartern.singletonDesignPattern;

public class MySingleTon implements Cloneable{

    private static MySingleTon instance= null;

    private MySingleTon(){
        if (instance != null){
           throw new NullPointerException("");
        }
    }

    public static MySingleTon getInstance(){

        synchronized (MySingleTon.class){
            if (instance == null){
                instance = new MySingleTon();
            }
        }
        return instance;
    }

    @Override
    public Object clone() {
        throw new UnsupportedOperationException();
    }
}
