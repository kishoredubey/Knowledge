package com.knowledge.design_patterns.structural.adapter;

public class EmployeeFromLDAP {
    private String uniqueId;
    private String first_name;
    private String email_address;

    public EmployeeFromLDAP(String uniqueId, String first_name, String email_address) {
        this.uniqueId = uniqueId;
        this.first_name = first_name;
        this.email_address = email_address;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getEmail_address() {
        return email_address;
    }
}
