package com.knowledge.string;

public class MaxRepeatingCharacter {
    public static void main(String[] args) {
        maxRepeatingChar("aaaabbaaccdeeeeeeeee");
    }

    private static void maxRepeatingChar(String str) {
        char[] arr = str.toCharArray();
        int count = 0;
        int curr_count = 1;
        char out = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                curr_count++;
            } else {
                if (curr_count > count) {
                    count = curr_count;
                    out = arr[i];
                }
                curr_count = 1;
            }
        }
        System.out.println(out);
    }
}
