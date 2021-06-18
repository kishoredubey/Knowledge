package com.knowledge.design_patterns.creational.abstract_factory;

public class AmexGoldCreditCard  extends CreditCard{
    private Validator validator;

    public AmexGoldCreditCard(Validator validator){
        this.validator = validator;
    }

    @Override
    public void validate() {
        validator.validate();
    }
}
