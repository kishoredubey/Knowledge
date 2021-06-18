package com.knowledge.design_patterns.creational.abstract_factory;

public class AmexValidator extends Validator {
    @Override
    public void validate() {
        System.out.println("Validating Amex ....");
    }
}
