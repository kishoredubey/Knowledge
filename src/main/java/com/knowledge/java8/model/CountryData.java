package com.knowledge.java8.model;

import java.util.List;

public class CountryData {
    private String code;
    private String name;
    private List<String> states;

    public CountryData(String code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return "CountryData{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", states=" + states +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getStates() {
        return states;
    }

    public void setStates(List<String> states) {
        this.states = states;
    }
}
