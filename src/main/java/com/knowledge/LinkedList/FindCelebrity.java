package com.knowledge.LinkedList;

public class FindCelebrity {
    public static void main(String[] args) {
        int[][] arr = {{0, 0, 0, 1}, {1, 0, 1, 1}, {1, 0, 0, 1}, {0, 0, 0, 0}};
        System.out.println(celebrity(arr, arr.length));
    }

    static int celebrity(int[][] M, int n) {
        int i = 0, j = n - 1;
        while (i < j) {
            if (M[j][i] == 1) // j knows i
                j--;
            else // i knows j
                i++;
        }
        // i points to our celebrity candidate
        int candidate = i;

        for (i = 0; i < n; i++) {
            if (i != candidate) {
                if (M[i][candidate] == 0
                        || M[candidate][i] == 1)
                    return -1;
            }
        }
        return candidate;
    }
}
