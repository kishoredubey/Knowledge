package com.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExampleTwo {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("discover", "", "sdk", "awesome", "java","");
        System.out.println(stringList.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList()));

        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("Discover", 1);
        myMap.put("Sdk", 2);
        myMap.put("com", 3);

        myMap.forEach((k,v) ->
                System.out.println("for key "+ k +" the value is "+ v));

    }
}
