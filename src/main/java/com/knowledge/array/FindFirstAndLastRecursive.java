package com.knowledge.array;

class Pair {
    long first, second;

    public Pair(long first, long second) {
        this.first = first;
        this.second = second;
    }
}

public class FindFirstAndLastRecursive {
    public static void main(String[] args) {
        long[] v = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        Pair p = new FindFirstAndLastRecursive().indexes(v, 5);
    }

    public Pair indexes(long v[], long x) {
        return new Pair(searchLeft(v, x, 0, v.length - 1, -1), searchRight(v, x, 0, v.length - 1, -1));
    }

    private int searchLeft(long v[], long key, int low, int high, int res) {

        if (low > high) {
            return res;
        }
        int mid = (high + low) / 2;
        if (key == v[mid]) {
            res = mid;
            return searchLeft(v, key, low, mid - 1, res);
        } else if (key > v[mid]) {
            return searchLeft(v, key, mid + 1, high, res);
        } else {
            return searchLeft(v, key, low, mid - 1, res);
        }
    }

    private int searchRight(long v[], long key, int low, int high, int res) {
        if (low > high) {
            return res;
        }
        int mid = (high + low) / 2;
        if (key == v[mid]) {
            res = mid;
            return searchRight(v, key, mid + 1, high, mid);
        } else if (key > v[mid]) {
            return searchRight(v, key, mid + 1, high, res);
        } else {
            return searchRight(v, key, low, mid - 1, res);
        }
    }
}
