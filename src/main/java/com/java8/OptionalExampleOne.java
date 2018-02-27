package com.java8;

import java.util.Optional;

public class OptionalExampleOne {
    public static void main(String[] args) {
        OptionalExampleOne one = new OptionalExampleOne();
        one.test();

    }

    public static boolean priceIsInRange(Modem modem) {
        boolean isInRange = false;

        if (modem != null && modem.getPrice() != null
                && (modem.getPrice() >= 10
                && modem.getPrice() <= 15)) {

            isInRange = true;
        }
        return isInRange;
    }

    public static boolean priceIsInRangeOptional(Modem modem) {
        return Optional.ofNullable(modem)
                .map(Modem::getPrice)
                .filter(p -> p >= 10)
                .filter(p -> p <= 15)
                .isPresent();
    }

    private void test() {
        //before Java Optional
        System.out.println(priceIsInRange(new Modem(9)));
        System.out.println(priceIsInRange(new Modem(12)));
        System.out.println(priceIsInRange(new Modem(20)));

        //after java optional
        System.out.println(priceIsInRangeOptional(new Modem(9)));
        System.out.println(priceIsInRangeOptional(new Modem(12)));
        System.out.println(priceIsInRangeOptional(new Modem(20)));
    }

    public class Modem {
        int price;

        public Modem(int price) {
            this.price = price;
        }

        public Integer getPrice() {
            return Integer.valueOf(price);
        }
    }
}
