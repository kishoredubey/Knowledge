package com.knowledge.design_patterns.structural.adapter;

public class EmployeeFromLDAPAdapter implements Employee {
    private EmployeeFromLDAP instance;

    public EmployeeFromLDAPAdapter(EmployeeFromLDAP employeeOneFromLDAP) {
        this.instance = employeeOneFromLDAP;
    }

    @Override
    public String getId() {
        return instance.getUniqueId();
    }

    @Override
    public String getFName() {
        return instance.getFirst_name();
    }

    @Override
    public String getEmail() {
        return instance.getEmail_address();
    }
}
