package com.knowledge.array;

/*
    Count the way the RAT has to reach to the end cell
 */
public class RatMazeTwo {
    public static void main(String[] args) {
        RatMazeTwo two = new RatMazeTwo();
        int arr[][] = {{1, 1, 1, 1}, {1, -1, -1, -1}, {1, 1, 1, 1}, {0, 1, 1, 1}};
        System.out.println(two.FindWays(4, 4, arr));
    }

    public int FindWays(int n, int m, int[][] blocked_cells) {
        boolean[][] visited_cells = new boolean[n][m];
        int out = 0;
        return findWaysUtil(n, m, 0, 0, blocked_cells, out);
    }

    int findWaysUtil(int n, int m, int i, int j, int[][] blocked_cells, int out) {
        if (i >= n || j >= m || blocked_cells[i][j] == -1) {
            return out;
        }
        if (i == n - 1 && j == m - 1) {
            return out++;
        }
        return findWaysUtil(n, m, i, j + 1, blocked_cells, out) +
                findWaysUtil(n, m, i + 1, j, blocked_cells, out);
    }
}
