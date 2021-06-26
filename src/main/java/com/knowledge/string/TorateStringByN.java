package com.knowledge.string;

public class TorateStringByN {

    public static void main(String[] args) {
        System.out.println(rotationalCipher("Zebra-493?", 3));
    }

    static String rotationalCipher(String input, int rotationFactor) {
        char[] arr = input.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int c = arr[i];
            if(Character.isDigit(c)) {
                int o = (c + rotationFactor - 48) % 10;
                arr[i] = (char) (o + 48);
            }
            if(c >= 65 && c <= 90) {
                int o = (c + rotationFactor - 65) % 26;
                arr[i] = (char) (o + 65);
            }
            if(c >= 97 && c <= 122) {
                int o = (c + rotationFactor - 97) % 26;
                arr[i] = (char) (o + 97);
            }
        }
        return String.valueOf(arr);
    }
}
