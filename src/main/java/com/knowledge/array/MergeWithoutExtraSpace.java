package com.knowledge.array;

public class MergeWithoutExtraSpace {
    public static void main(String[] args) {
        long[] a = {1, 3, 5, 7};
        long[] b = {0, 2, 6, 8, 9};
        merge(a, b, a.length, b.length);
        for(long k : a){
            System.out.print(k + " ");
        }
        System.out.println();
        for(long k : b){
            System.out.print(k + " ");
        }
    }
    public static void merge(long arr1[], long arr2[], int n, int m)
    {
        int i=0, j=0;
        while(i<n && j<m){
            if(arr1[i] < arr2[j]){
                i++;
                continue;
            }

            if(arr1[i] >= arr2[j]){
                long t = arr1[i];
                arr1[i] = arr2[j];
                arr2[j]= t;
                j = swapAndSort(arr2, arr2[j], j);
            }
            i++;
        }
    }
    static int swapAndSort(long[] arr, long num, int index){
        int temp = 0;
        for(int i=index+1; i< arr.length ;  i++) {
            if(arr[i] < num){
                long t = arr[i];
                arr[i] = num;
                arr[i-1]= t;
                temp = i;
            }
        }
        return temp;
    }
}
