package com.knowledge.design_patterns.creational.singleton;

public class SingletonPatternExample {
    public static void main(String[] args) {
        Singleton oneSingleton = Singleton.getInstance();
        Singleton twoSingleton = Singleton.getInstance();

        if (oneSingleton == twoSingleton){
            System.out.println("Objects are identical !! ");
            System.out.println(oneSingleton);
            System.out.println(twoSingleton);
        }
    }
}
