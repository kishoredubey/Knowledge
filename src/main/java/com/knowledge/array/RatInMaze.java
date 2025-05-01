package com.knowledge.array;

import java.util.ArrayList;
import java.util.List;

public class RatInTheMaze {
    public static void main(String[] args) {
        int arr[][] = {{1, 0, 0, 0}, {1, 1, 0, 1}, {1, 1, 0, 0}, {0, 1, 1, 1}};
        boolean[][] visited = new boolean[arr.length][arr[0].length];
        findPath(arr, visited, 0, 0, "");
    }

    public static void findPath(int[][] arr, boolean[][] visited, int i, int j, String psf) {
        if (i == arr.length - 1 && j == arr[0].length - 1) {
            System.out.println(psf);
            return;
        }
        if (i < 0 || j < 0 || i >= arr.length || j >= arr[0].length || arr[i][j] == 0 || visited[i][j]) {
            return;
        }
        visited[i][j] = true;
        findPath(arr, visited, i + 1, j, psf + "D");
        findPath(arr, visited, i, j + 1, psf + "R");
        findPath(arr, visited, i - 1, j, psf + "U");
        findPath(arr, visited, i, j - 1, psf + "L");
        visited[i][j] = false;
    }
}

