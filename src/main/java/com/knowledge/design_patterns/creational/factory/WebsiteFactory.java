package com.knowledge.design_patterns.creational.factory;

public class WebsiteFactory {
    public static Website getWebsite(String type){
        switch (type){
            case "blog": {
                return new Blog();
            }
            case "shop": {
                return new Shop();
            }
            default: {
                return null;
            }
        }
    }
}
