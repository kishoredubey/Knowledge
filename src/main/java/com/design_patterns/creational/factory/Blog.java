package com.design_patterns.creational.factory;

public class Blog  extends Website{
    @Override
    public void createWebSite() {
        pages.add(new AboutPage());
        pages.add(new ContactPage());
    }
}
