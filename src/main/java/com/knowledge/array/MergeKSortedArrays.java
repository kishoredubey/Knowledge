package com.knowledge.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MergeKSortedArrays {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4}, {2,2,3,4}, {5,5,6,6},{7,8,9,9}};
        ArrayList<Integer> out = mergeKArrays(arr, arr.length);
        out.size();
    }
    public static ArrayList<Integer> mergeKArrays(int[][] arr, int K)
    {
        int[] out = new int[0];
        for(int i=0; i<arr.length; i++) {
            out = merge(arr[i], out);
        }
        return new ArrayList(Collections.singleton(out));
    }

    static int[] merge(int[] arr1, int[] arr2) {
        int i = 0, j = 0, k = 0;
        int[] out = new int[arr1.length + arr2.length];
        while(i<arr1.length && j< arr2.length) {
            if(arr1[i] < arr2[j]) {
                out[k] = arr1[i];
                k++;
                i++;
            } else {
                out[k] = arr2[j];
                k++;
                j++;
            }
        }
        while(i<arr1.length) {
            out[k] = arr1[i];
            k++;
            i++;
        }
        while(j< arr2.length) {
            out[k] = arr2[j];
            k++;
            j++;
        }
        return out;
    }
}
