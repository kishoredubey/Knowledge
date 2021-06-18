package com.knowledge.design_patterns.creational.abstract_factory;

public class AbstractFactoryPatternExample {
    public static void main(String[] args) {
        CreditCardFactory abstractFactory = CreditCardFactory.getfactory(550);
        CreditCard creditCard = abstractFactory.getCreditCard("GOLD");
        creditCard.validate();
    }
}
