package com.knowledge.algo;

import java.util.*;

class Discount {
    int percentage;
    int weight; // This is the percentage of users this applies to

    public Discount(int percentage, int weight) {
        this.percentage = percentage;
        this.weight = weight;
    }
}

public class DiscountSelector {
    private static final SplittableRandom random = new SplittableRandom();
    private final NavigableMap<Integer, Integer> probabilityMap = new TreeMap<>();
    private int totalWeight = 0;

    public DiscountSelector(List<Discount> discounts) {
        for (Discount d : discounts) {
            if (d.weight <= 0) continue;
            totalWeight += d.weight;
            probabilityMap.put(totalWeight, d.percentage); // cumulative range
        }
        if (totalWeight != 100) {
            throw new IllegalArgumentException("Total discount weight must be 100%");
        }
    }

    public int getDiscount() {
        int rand = random.nextInt(1, totalWeight + 1); // 1 to 100 inclusive
        return probabilityMap.ceilingEntry(rand).getValue();
    }

    public static void main(String[] args) {
        List<Discount> discounts = List.of(
            new Discount(10, 70),
            new Discount(20, 20),
            new Discount(30, 10)
        );

        DiscountSelector selector = new DiscountSelector(discounts);

        // Simulate discount selection
        for (int i = 0; i < 20; i++) {
            System.out.println(selector.getDiscount());
        }
    }
}

