package com.example.arrayPractice;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
    int a[] = { 2,11,15,7};
        int[] c = twoSum(a, 9);
        for(int i =0;i<c.length;i++){
            System.out.println(c[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
