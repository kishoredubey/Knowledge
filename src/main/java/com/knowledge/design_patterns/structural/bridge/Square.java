package com.knowledge.design_patterns.structural.bridge;

public class Square extends Shape {
    protected Square(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.print("Square applying");
        color.applyColor();
    }

}
