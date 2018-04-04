package com.java8.model;

public class FilterModel {
    private boolean enable;

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    @Override
    public String toString() {
        return "FilterModel{" +
                "enable=" + enable +
                '}';
    }
}
