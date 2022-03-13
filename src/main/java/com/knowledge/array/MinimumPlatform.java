package com.knowledge.array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MinimumPlatform {
    public static void main(String[] args) {
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
        System.out.println(findPlatform(arr, dep));
    }

    static int findPlatform(int arr[], int dep[]) {
        List<Integer> trackTrains = new ArrayList<Integer>();
        int platformCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (trackTrains.size() == 0) {
                trackTrains.add(i);
                platformCount++;
            } else {
                Iterator<Integer> it = trackTrains.listIterator();
                while(it.hasNext()) {
                    if (dep[it.next().intValue()] > arr[i] && trackTrains.size() >= platformCount) {
                        platformCount++;
                    } else {
                        it.remove();
                    }
                }
                trackTrains.add(i);
            }
        }
        return platformCount;
    }
}
