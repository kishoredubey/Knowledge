package com.knowledge.graph;

import java.util.ArrayList;
import java.util.Collections;

public class CombinationSum {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(7);list.add(2);list.add(6);list.add(5);
        ArrayList out = combinationSum(list , 16);
        System.out.println(out);
    }
    static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> arr, int target)
    {
        ArrayList<ArrayList<Integer>> out = new ArrayList<ArrayList<Integer>>();
        Collections.sort(arr);
        ArrayList<Integer> current = new ArrayList<Integer>();
        combination(out, arr, 0, target , current);
        return out;
    }

    static void combination(
            ArrayList<ArrayList<Integer>> out,
            ArrayList<Integer> arr,
            int index,
            int target,
            ArrayList<Integer> current)
    {
        if(target == 0) {
            out.add(new ArrayList(current));
            return;
        }

        for(int i = index; i < arr.size(); i++){
            if(target - arr.get(i) >= 0) {
                current.add(arr.get(i));
                combination(out, arr, i, target - arr.get(i) , current);
                current.remove(arr.get(i));
            }
        }

    }
}
