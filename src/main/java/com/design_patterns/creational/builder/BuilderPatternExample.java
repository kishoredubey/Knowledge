package com.design_patterns.creational.builder;

/*
    Makes the origional obejct immutable - which is good and bad.
    Removes the problem of telescoping constructors.
 */

public class BuilderPatternExample {
    public static void main(String[] args) {
        LunchOrder.Builder builder = new LunchOrder.Builder();
        LunchOrder lunchOrder = builder.bread("Wheat Bread")
                .condiments("New Condiments")
                .dressing("chipotle")
                .meat("No Meat")
                .build();

        System.out.println(lunchOrder);
    }
}
