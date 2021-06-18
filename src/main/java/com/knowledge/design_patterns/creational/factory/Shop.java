package com.knowledge.design_patterns.creational.factory;

public class Shop extends Website {
    @Override
    public void createWebSite() {
        pages.add(new ContactPage());
        pages.add(new CartPage());
    }
}
