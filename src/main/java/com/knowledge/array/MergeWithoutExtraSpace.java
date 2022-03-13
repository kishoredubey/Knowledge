package com.knowledge.array;

public class MergeWithoutExtraSpace {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7};
        int[] b = {0, 2, 6, 8, 9};
        merge(a, b, a.length, b.length);
        for (long k : a) {
            System.out.print(k + " ");
        }
        System.out.println();
        for (long k : b) {
            System.out.print(k + " ");
        }
    }

    private static void merge(int arr1[], int arr2[], int n, int m) {
        int i = 0;
        while (i < n) {
            if (arr1[i] > arr2[0]) {
                int last = arr1[n - 1];
                swapArray1(i + 1, arr1);
                arr1[i] = arr2[0];

                arrangeArr2(arr2, last);
            }
            i++;
        }
    }

    static void swapArray1(int pos, int arr[]) {
        int i = arr.length-1;
        while (i >= pos) {
            arr[i] = arr[i - 1];
            i--;
        }
    }

    static void arrangeArr2(int arr[], int val) {
        arr[0] = val;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }
}
