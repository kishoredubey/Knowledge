package com.knowledge.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 0, 9, 4, 7, 9};
        sort(arr, 0, arr.length - 1);
        for (int i :arr){
            System.out.print(i +" ");
        }
    }

    private static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            sort(arr, low, mid);
            sort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int[] l = new int[n1];
        int[] r = new int[n2];
        for (int i = 0; i < n1; i++) {
            l[i] = arr[low + i];
        }
        for (int i = 0; i < n2; i++) {
            r[i] = arr[i + mid + 1];
        }
        int i = 0, j = 0, k = low;
        while (i < n1 && j < n2) {
            if (l[i] < r[j]) {
                arr[k] = l[i];
                i++;
            } else {
                arr[k] = r[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = l[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = r[j];
            j++;
            k++;
        }
    }
}
