package com.doit.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        List<String> aList = Arrays.asList("X","K", "A", "L", "Z");
        List<String> bList = Arrays.asList("A","Z", "K");
        List<String> cList = Arrays.asList("Z");

        aList.sort(Comparator.comparing(item -> bList.indexOf(item)));
        System.out.println(aList);
        aList.sort(Comparator.comparing(item -> cList.indexOf(item)));

        System.out.println(aList);
    }
}
