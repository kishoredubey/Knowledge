package com.design_patterns.creational.factory;

import javax.xml.ws.WebFault;

public class FactoryPatternExample {
    public static void main(String[] args) {
        Website website = WebsiteFactory.getWebsite("shop");
        System.out.println(website);

        website = WebsiteFactory.getWebsite("blog");
        System.out.println(website);

    }
}
