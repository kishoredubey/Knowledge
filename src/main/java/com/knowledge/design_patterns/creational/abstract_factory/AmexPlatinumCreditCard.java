package com.knowledge.design_patterns.creational.abstract_factory;

public class AmexPlatinumCreditCard extends CreditCard{

    private Validator validator;

    public AmexPlatinumCreditCard(Validator validator){
        this.validator = validator;
    }
    @Override
    public void validate() {
        validator.validate();
    }
}
