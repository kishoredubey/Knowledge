package com.design_patterns.creational.abstract_factory;

public abstract class CreditCardFactory {
    public static CreditCardFactory getfactory(int creditScore){
        if (creditScore >650){
            return new AmexFactory();
        }else{
            return new VisaFactory();
        }
    }
    public abstract CreditCard getCreditCard(String  creditCard);
}
