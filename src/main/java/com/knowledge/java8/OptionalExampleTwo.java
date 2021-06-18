package com.knowledge.java8;

import com.knowledge.java8.model.CountryData;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

/*
    Optional below will either return the states or return an empty collection.
 */
public class OptionalExampleTwo {
    public static void main(String[] args) {

        CountryData countryData = new CountryData("A", "AA");
//        Arrays.asList("A","B","C","D")
        countryData.setStates(null);

        List<String> states = Optional.ofNullable(countryData)
                .map(data -> data.getStates())
                .orElseGet(Collections::emptyList);
        System.out.println(states);
    }
}
