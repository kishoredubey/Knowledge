package com.knowledge.array;

/**
 * partition the array so that element's sum in each part is equal.
 */
public class PartitionSubset {
    public static void main(String[] args) {
        int[] a = {1, 5, 11, 5};
        System.out.println(equalPartition(a.length, a));
    }
    static int equalPartition(int n, int arr[])
    {
        int sum = 0;
        for(int i =0; i< arr.length; i++){
            sum+= arr[i];
        }
        if(sum%2 != 0){
            return 0;
        }

        if(partition(arr, n, sum/2)){
            return 1;
        }else{
            return 0;
        }
    }

    static boolean partition(int[] arr, int n, int sum){

        if(sum == 0) return true;
        if(sum != 0 && n == 0) return false;

        if(arr[n-1] > sum ){
            partition(arr, n-1, sum);
        }

        return partition(arr, n-1, sum) ||
                partition(arr, n-1, sum - arr[n-1]);
    }
}
