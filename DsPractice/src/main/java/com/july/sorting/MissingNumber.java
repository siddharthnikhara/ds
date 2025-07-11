package com.july.sorting;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{3, 0, 1}));
    }

    public static int missingNumber(int[] nums) {
            int n = nums.length;
            int missing = 0;

            // XOR all numbers from 0 to n
            for (int i = 0; i <= n; i++) {
                missing ^= i;
            }

            // XOR all elements in nums
            for (int num : nums) {
                missing ^= num;
            }

            return missing;
        }
}
