package com.knowledge.design_patterns.structural.bridge;

public class BridgePatternExample {
    public static void main(String[] args) {
        Color red = new Red();
        Shape square = new Square(red);

        square.applyColor();

        Shape circle = new Circle(red);
        circle.applyColor();
    }
}
