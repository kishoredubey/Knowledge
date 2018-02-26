package com.doit.java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate <String> nameFilter = name -> name.startsWith("s");
        String aName = "sKishore";
        System.out.println(nameFilter.test(aName));


        Consumer printConsumer = (message -> System.out.println(message));
        String aMessage = "Hi, This is consumer test";
        printConsumer.accept(aMessage);

        Function<String, String> upperCaseFunction = name -> name.toUpperCase();
        System.out.println(upperCaseFunction.apply(aName));
    }
}
