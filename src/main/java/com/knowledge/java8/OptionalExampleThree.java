package com.knowledge.java8;

import com.knowledge.java8.model.CountryData;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalExampleThree {
    public static void main(String[] args) {
        List<CountryData> countryDataList = null;
        //Arrays.asList(new CountryData("A","AA"), new CountryData("B","BB"));

        List<CountryData> data = Optional.ofNullable(countryDataList).orElseGet(Collections::emptyList)
                .stream()
                .map(p -> new CountryData(p.getCode(), p.getName()))
                .collect(Collectors.toList());

        System.out.println(data);

    }
}
