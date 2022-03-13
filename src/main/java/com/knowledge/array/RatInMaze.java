package com.knowledge.array;

import java.util.ArrayList;
import java.util.List;

public class RatInMaze {
    public static void main(String[] args) {
        int arr[][] = {{1, 0, 0, 0}, {1, 1, 0, 1}, {1, 1, 0, 0}, {0, 1, 1, 1}};
        List<String> out = findPath(arr, arr.length);
        System.out.println(out);
    }

    public static ArrayList<String> findPath(int[][] m, int n) {
        boolean visited[][] = new boolean[n][n];
        ArrayList<String> out = new ArrayList<String>();
        if (n < 1 || m[n - 1][n - 1] == 0 || m[0][0] == 0) {
            return out;
        }
        findPathUtil(m, 0, 0, visited, out, "", "");
        return out;
    }

    static void findPathUtil(int[][] m, int i, int j, boolean[][] visited, ArrayList<String> out, String word, String direction) {
        if (i < 0 || j < 0 || i == m.length || j == m.length || m[i][j] == 0 || visited[i][j]) {
            return;
        }
        if (i == m.length - 1 && j == m.length - 1) {
            out.add(word);
            return;
        }
        visited[i][j] = true;
        word = word + direction;

        findPathUtil(m, i - 1, j, visited, out, word, "U");
        findPathUtil(m, i + 1, j, visited, out, word, "D");
        findPathUtil(m, i, j - 1, visited, out, word, "L");
        findPathUtil(m, i, j + 1, visited, out, word, "R");
    }
}
