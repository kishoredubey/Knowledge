package com.design_patterns.creational.abstract_factory;

public abstract class CreditCard {
    private String cvc;
    private String card_number;

    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }
    public abstract void validate();
}
