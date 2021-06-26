package com.knowledge.graph;

import java.util.ArrayList;
import java.util.List;

public class Stairs {
    public static void main(String[] args) {
        System.out.println(countWays(84));
    }
    static int countWays(int n)
    {
        List<Integer> out = new ArrayList<>();
        out.add(1);
        out.add(1);
        for(int i=2; i <=n; i++){
            out.add(out.get(i-1) + out.get(i-2));
        }
        return out.get(n);
    }
}
