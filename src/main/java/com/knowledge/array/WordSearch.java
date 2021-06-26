package com.knowledge.array;

import java.util.ArrayList;

public class WordSearch {
    public static void main(String[] args) {
        WordSearch search = new WordSearch();
        String[] dict = {"GEEKS", "FOR", "QUIZ", "GO"};
        char[][] board = {{'G', 'I', 'Z'}, {'U', 'E', 'K'}, {'Q', 'S', 'E'}};
        ArrayList<String> out = search.wordBoggle(board, dict);

        System.out.println(out);
    }

    public ArrayList<String> wordBoggle(char board[][], String[] dictionary) {
        ArrayList<String> out = new ArrayList<>();
        for (int k = 0; k < dictionary.length; k++) {
            if (isWordFound(board, dictionary[k])) {
                out.add(dictionary[k]);
            }
        }
        return out;
    }

    boolean isWordFound(char board[][], String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == word.charAt(0) && dfs(board, i, j, 0, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean dfs(char board[][], int i, int j, int count, String word) {

        if (count == word.length()) {
            return true;
        }

        if (i < 0 || i >= board.length || j < 0 || j >= board[i].length || board[i][j] != word.charAt(count)) {
            return false;
        }

        char temp = board[i][j];
        board[i][j] = '-';

        boolean found =
                dfs(board, i+1, j, count+1, word) ||
                        dfs(board, i-1, j, count+1, word) ||
                        dfs(board, i, j+1, count+1, word) ||
                        dfs(board, i, j-1, count+1, word) ||
                        dfs(board, i+1, j+1, count+1, word) ||
                        dfs(board, i-1, j-1, count+1, word) ||
                        dfs(board, i-1, j+1, count+1, word) ||
                        dfs(board, i+1, j-1, count+1, word);

        board[i][j] = temp;
        return found;
    }
}
