package com.example.arrayPractice;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumWithNegativeNO {

    public static void subArraySum(int[] arr, int sum) {
        // Map to store cumulative sum and its index
        Map<Integer, Integer> map = new HashMap<>();

        int currSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            // Case 1: If the current sum is equal to the desired sum
            if (currSum == sum) {
                System.out.println("Subarray found from index 0 to " + i);
                return;
            }

            // Case 2: If (currSum - sum) exists in map, subarray found
            if (map.containsKey(currSum - sum)) {
                int start = map.get(currSum - sum) + 1;
                System.out.println("Subarray found from index " + start + " to " + i);
                return;
            }

            // Store current sum with index
            map.put(currSum, i);
        }

        System.out.println("No subarray with given sum found");
    }

    public static void main(String[] args) {
        int[] arr = {15, 2, 4, 8, 9, 5, 10, 23};
        int sum = 23;

        subArraySum(arr, sum);
    }

}
