package com.knowledge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Test {
    public static void main(String[] args) {
        Character.isDigit('a');
        int arr[] = {900, 1100, 1235};
        int dep[] = {1000, 1200, 1240};
        System.out.println(new Test().findPlatform(arr, dep, 3));
    }

    static int findPlatform(int arr[], int dep[], int n)
    {
        ArrayList<Integer> copy = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            copy.add(arr[i]);
        }
        Arrays.sort(arr);
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        for(int i=0; i<arr.length; i++) {
            Integer t = queue.peek();
            if(t!=null && t<arr[i]) {
                queue.remove();
            }
            queue.add(dep[copy.indexOf(arr[i])]);
        }
        return queue.size();
    }
}
