package com.knowledge.array;

public class FacebookSubArray {

    public static void main(String[] args) {
        int[] out = countSubArrays(new int[]{3, 4, 1, 6, 2});
        for (int i = 0; i < out.length; i++) {
            System.out.print(out[i] + " ");
        }
    }

    static int[] countSubArrays(int[] arr) {
        int[] out = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            int j = i - 1;
            while (j >= 0) {
                if (arr[i] < arr[j]) {
                    break;
                }
                count++;
                j--;
            }
            int k = i + 1;
            while (k < arr.length) {
                if (arr[i] < arr[k]) {
                    break;
                }
                count++;
                k++;
            }
            out[i] = count;
        }
        return out;
    }
}
