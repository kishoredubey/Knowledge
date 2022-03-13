package com.knowledge.algo;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

class ProbabilityRange {
    int begin;
    int end;

    public ProbabilityRange(int begin, int end) {
        this.begin = begin;
        this.end = end;
    }
}

class DiscountObject {
    int discountPercentage;
    ProbabilityRange probability;

    public DiscountObject(int discountPercentage, ProbabilityRange probability) {
        this.discountPercentage = discountPercentage;
        this.probability = probability;
    }
}

public class ProbabilityOfDiscounts {
    public static void main(String[] args) {
        List<DiscountObject> objects = new ArrayList<>();


        objects.add(new DiscountObject(30, new ProbabilityRange(0, 1)));
        objects.add(new DiscountObject(20, new ProbabilityRange(2, 20)));
        objects.add(new DiscountObject(10, new ProbabilityRange(20, 100)));
        for (int i = 0; i < 20; i++) {
            System.out.println(findDiscount(objects));
        }
    }

    private static int findDiscount(List<DiscountObject> objects) {
        SplittableRandom generator = new SplittableRandom();
        int probability = generator.nextInt(0, 100);
        DiscountObject out = null;
        for (DiscountObject object : objects) {
            if (object.probability.begin <= probability && object.probability.end >= probability) {
                out = object;
                break;
            }
        }
        return out.discountPercentage;
    }
}
