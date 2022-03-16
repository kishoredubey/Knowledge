package com.knowledge.string;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        System.out.println(findFirstNonRepeatingChar("geeksforgeeks"));
    }

    static Character findFirstNonRepeatingChar(String str) {
        int[] count = new int[256];
        for (char c : str.toCharArray()) {
            count[c]++;
        }
        int index = -1;
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 1) {
                index = i;
                break;
            }
        }
        return (char) index;
    }
}
