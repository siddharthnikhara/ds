package com.example.arrayPractice;

import java.util.*;

public class LeadersInArray {

    public static void findLeaders(int[] arr) {
        int n = arr.length;
        List<Integer> leaders = new ArrayList<>();

        int maxFromRight = arr[n - 1];
        leaders.add(maxFromRight); // Last element is always a leader

        // Traverse from second last to the beginning
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                leaders.add(maxFromRight);
            }
        }

        // Reverse the result to print in original order
        Collections.reverse(leaders);

        System.out.println("Leaders in the array: " + leaders);
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        findLeaders(arr);
    }
}
