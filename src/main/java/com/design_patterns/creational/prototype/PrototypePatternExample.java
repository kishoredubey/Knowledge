package com.design_patterns.creational.prototype;

/*
    Deep copy and Shallow copy are the options to create prototype. - Deep copy will also return new copies
    of reference objects in the class.
 */
public class PrototypePatternExample {
    public static void main(String[] args) {
        Registry registry = new Registry();
        Movie aMovie = (Movie) registry.createItem("movie");
        aMovie.setPrice(80);

        System.out.println(aMovie);

    }
}
