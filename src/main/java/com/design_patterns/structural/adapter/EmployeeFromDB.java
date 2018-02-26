package com.design_patterns.structural.adapter;

public class EmployeeFromDB implements Employee {

    private String id;
    private String fName;
    private String email;

    public EmployeeFromDB(String id, String fName, String email) {
        this.id = id;
        this.fName = fName;
        this.email = email;
    }

    @Override
    public String getId() {
        return null;
    }

    @Override
    public String getFName() {
        return null;
    }

    @Override
    public String getEmail() {
        return null;
    }
}
