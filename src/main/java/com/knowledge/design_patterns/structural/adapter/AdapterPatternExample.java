package com.knowledge.design_patterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterPatternExample {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        EmployeeFromDB employeeOneFromDB = new EmployeeFromDB("1", "Kishore", "kishore@email.com");
        EmployeeFromDB employeeTwoFromDB = new EmployeeFromDB("2", "Kavish", "kavish@email.com");

        employees.add(employeeOneFromDB);
        employees.add(employeeTwoFromDB);

        EmployeeFromLDAP employeeOneFromLDAP = new EmployeeFromLDAP("11", "Ravi", "ravi@email.com");
        EmployeeFromLDAP employeeTwoFromLDAP = new EmployeeFromLDAP("12", "Sandeep", "sandeep@email.com");

        employees.add(new EmployeeFromLDAPAdapter(employeeOneFromLDAP));
        employees.add(new EmployeeFromLDAPAdapter(employeeTwoFromLDAP));

    }
}
