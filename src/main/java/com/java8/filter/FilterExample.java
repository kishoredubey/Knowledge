package com.java8.filter;

import com.java8.model.FilterModel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args) {
        FilterModel model = new FilterModel();
        model.setEnable(false);
        FilterModel aModel = new FilterModel();
        aModel.setEnable(false);

        FilterModel bModel = new FilterModel();
        bModel.setEnable(true);

        List<FilterModel> lists = new ArrayList<>();
        lists.add(model);
        lists.add(aModel);
        lists.add(bModel);

        List newList = lists.stream().filter(t -> t.isEnable()).collect(Collectors.toList());
        System.out.println(newList.toString());
    }
}
