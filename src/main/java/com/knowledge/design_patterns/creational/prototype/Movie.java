package com.knowledge.design_patterns.creational.prototype;

public class Movie extends Item {
    private String runtime;

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + super.getTitle() + '\'' +
                "price='" + super.getPrice() + '\'' +
                "runtime='" + runtime + '\'' +
                '}';
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }
}
