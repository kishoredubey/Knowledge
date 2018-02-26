package com.design_patterns.creational.abstract_factory;

public class VisaGoldCreditCard extends CreditCard{
    private Validator validator;

    public VisaGoldCreditCard(Validator validator){
        this.validator = validator;
    }

    @Override
    public void validate() {
        validator.validate();
    }
}
