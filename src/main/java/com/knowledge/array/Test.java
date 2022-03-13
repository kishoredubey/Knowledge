package com.knowledge.array;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        System.out.println(fractionToDecimal(-1, -2147483648));
    }
    public static String fractionToDecimal(int numerator, int denominator) {
        if(numerator == 0) return "0";
        if(denominator == 0) return "";

        StringBuilder sb = new StringBuilder();
        if(numerator < 0 && denominator > 0) {
            sb.append("-");
        }
        if(numerator > 0 && denominator < 0) {
            sb.append("-");
        }

        int num = Math.abs(numerator);
        int denom = denominator < 0 ? -denominator : denominator;

        long quo = num/denom;
        long rem = (num%denom) * 10;
        sb.append(String.valueOf(quo));
        if(rem == 0) {
            return sb.toString();
        }
        sb.append(".");

        Map<Long, Integer> check = new HashMap();
        while(rem != 0) {
            if(check.containsKey(rem)) {
                int index = check.get(rem);
                return sb.substring(0, index) + "("+ sb.substring(index) +")";
            }
            check.put(rem, sb.length());
            quo = rem/denom;
            sb.append(String.valueOf(quo));
            rem = (rem%denom) * 10;
        }
        return sb.toString();
    }
}
