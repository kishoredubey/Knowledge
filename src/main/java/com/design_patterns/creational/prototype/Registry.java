package com.design_patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String, Item> items = new HashMap<>();
    public Registry(){
        loadItems();
    }

    public Item createItem(String type){
        Item item = null;
        try{
            item = (Item) items.get(type).clone();
        }catch (Exception e){

        }
        return item;
    }

    private void loadItems(){
        Movie movie  = new Movie();
        movie.setRuntime("100");
        movie.setPrice(10);

        items.put("movie", movie);

        Book book = new Book();
        book.setNoOfPages(100);
        book.setPrice(5);

        items.put("book", book);
    }
}
