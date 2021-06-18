package com.knowledge.design_patterns.creational.abstract_factory;

public class VisaFactory extends CreditCardFactory{
    @Override
    public CreditCard getCreditCard(String creditCard) {
        CreditCard card = null;
        switch (creditCard){
            case "GOLD":{
                card = new VisaGoldCreditCard(new VisaValidator());
            }
            default: break;
        }
        return card;
    }
}
