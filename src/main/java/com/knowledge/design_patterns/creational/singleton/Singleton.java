package com.knowledge.design_patterns.creational.singleton;

public class Singleton {
    private static  Singleton singleton = null;
    private Singleton(){
    }

    private static Object lock = new Object();

    public static Singleton getInstance(){
        if (singleton==null){
            synchronized (lock){
                if (singleton==null)
                    singleton = new Singleton();
            }
        }
        return singleton;
    }
}
