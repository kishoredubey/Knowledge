package com.knowledge.array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MinimumPlatform {
    public static void main(String[] args) {
        int[] arr = {900, 940, 950, 1100, 1120, 1800};
        int[] dep = {950, 1200, 1120, 1130, 1900, 2000};
        System.out.println(findPlatform(arr, dep));
    }

    static int findPlatform(int arr[], int dep[]) {
        List<Integer> arrivedTrains = new ArrayList<>();
        int platformCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arrivedTrains.size() == 0) {
                platformCount++;
            } else {
                Iterator<Integer> it = arrivedTrains.listIterator();
                while(it.hasNext()) {
                    if (dep[it.next().intValue()] >= arr[i]) {
                        if (arrivedTrains.size() >= platformCount) {
                            platformCount++;
                        }
                    } else {
                        it.remove();
                    }
                }
            }
            arrivedTrains.add(i);
        }
        return platformCount;
    }
}
