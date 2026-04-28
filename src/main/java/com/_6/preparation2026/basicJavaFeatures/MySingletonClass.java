package com._6.preparation2026.basicJavaFeatures;

public class MySingletonClass {

    private static  MySingletonClass  instance =null;

    private MySingletonClass(){

        /**
         * prevent breaking singleton through reflection
         */
        if (instance!=null){
            throw new RuntimeException("Reflection doesnt work here");
        }
    }

    /**
     * prevent singleton breaking through deserialization
     * @return
     */
    public Object readResolve(){
        return getInstance();
    }

     public static MySingletonClass getInstance(){
        synchronized (MySingletonClass.class){
            if (instance==null){
                instance =new MySingletonClass();
            }
        }
        return instance;
    }

    /**
     * prevent breaking singleton through clonable interface
     * @return
     */
    @Override
    protected Object clone()  {
        return new CloneNotSupportedException();
    }
}
