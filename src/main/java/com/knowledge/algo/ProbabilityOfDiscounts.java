package com.knowledge.algo;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

class DiscountObject{
    public int discountPercentage;
    public int probability;

    public DiscountObject(int discountPercentage, int probability) {
        this.discountPercentage = discountPercentage;
        this.probability = probability;
    }

    @Override
    public String toString() {
        return "DiscountObject{" +
                "discountPercentage=" + discountPercentage +
                ", probability=" + probability +
                '}';
    }
}
public class ProbabilityOfDiscounts {
    public static void main(String[] args) {
        List<DiscountObject> objects = new ArrayList<>();

        objects.add(new DiscountObject(30,10));
        objects.add(new DiscountObject(20,20));
        objects.add(new DiscountObject(10,70));
        for (int i=0; i<20; i++) {
            System.out.println(findDiscount(objects));
        }
    }

    private static DiscountObject findDiscount(List<DiscountObject> objects) {
        SplittableRandom generator = new SplittableRandom();
        int probability = generator.nextInt(0,100);
        DiscountObject out = null;
        for (DiscountObject object: objects){
            if (object.probability > probability) {
                out = object;
                break;
            }
        }
        return out;
    }
}
