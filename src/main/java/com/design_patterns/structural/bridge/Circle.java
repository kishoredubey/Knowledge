package com.design_patterns.structural.bridge;

public class Circle extends Shape {
    protected Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.print("Circle applying");
        color.applyColor();
    }
}
