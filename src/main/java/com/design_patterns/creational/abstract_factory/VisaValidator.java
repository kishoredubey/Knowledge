package com.design_patterns.creational.abstract_factory;

public class VisaValidator  extends Validator{
    @Override
    public void validate() {
        System.out.println("Validating Visa .....");
    }
}
