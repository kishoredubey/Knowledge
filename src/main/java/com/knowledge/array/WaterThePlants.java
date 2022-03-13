package com.knowledge.array;

import java.util.HashSet;
import java.util.Set;

/**
 * A gallery with plants is divided into n parts, numbered : 0,1,2,3...n-1. There are provisions for attaching water sprinklers at every partition. A sprinkler with range x at partition i can water all partitions from i-x to i+x.
 * Given an array gallery[ ] consisting of n integers, where gallery[i] is the range of sprinkler at partition i (power==-1 indicates no sprinkler attached), return the minimum number of sprinklers that need to be turned on to water the complete gallery.
 * If there is no possible way to water the full length using the given sprinklers, print -1.
 */
public class WaterThePlants {
    public static void main(String[] args) {
        int[] arr = {-1, 5, 1, -1, 5, -1, -1, 5, 0, 2, -1, -1, 2, 0};
        System.out.println(min_sprinklers(arr, arr.length));
    }

    static int min_sprinklers(int gallery[], int n) {
        int[] temp = new int[gallery.length];

        for (int i = 0; i < gallery.length; i++) {
            temp[i] = -1;
        }


        for (int i = 0; i < gallery.length; i++) {
            int leftCapacity = i - gallery[i];
            int rightCapacity = i + gallery[i];

            if (temp[i] == -1 && gallery[i] != -1) {
                temp[i] = i;
            }
            if (temp[i] != -1 && gallery[i] >= gallery[temp[i]]) {
                temp[i] = i;
            }

            int k = i;
            while (k > 0 && k > leftCapacity) {
                if (temp[k - 1] == -1 || gallery[temp[k - 1]] <= gallery[i]) {
                    temp[k - 1] = i;
                }
                k--;
            }
            k = i; // k = 3
            while (k < gallery.length - 1 && k < rightCapacity) {
                if (temp[k + 1] == -1 || gallery[temp[k + 1]] <= gallery[i]) {
                    temp[k + 1] = i;
                }
                k++;
            }
        }

        Set set = new HashSet<Integer>();
        for (int i = 0; i < gallery.length; i++) {
            if (temp[i] == -1) {
                return -1;
            }
            set.add(temp[i]);
        }

        return set.size();
    }
}
