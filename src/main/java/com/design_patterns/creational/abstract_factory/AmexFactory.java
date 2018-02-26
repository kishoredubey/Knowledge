package com.design_patterns.creational.abstract_factory;

public class AmexFactory extends CreditCardFactory {
    @Override
    public CreditCard getCreditCard(String creditCard) {
        CreditCard card = null;
        switch (creditCard){
            case "GOLD": {
                card =  new AmexGoldCreditCard(new AmexValidator());
            }
            case "PLATINUM":{
                card =  new AmexPlatinumCreditCard(new AmexValidator());
            }
            default:
                break;
        }
        return card;
    }
}
