package com.example.hashing;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithSumZero {
    public static void main(String[] args) {
        int arr[] ={4 ,2, -3 ,1, 6};
        int n =5;
        System.out.println(findsum(arr,n));
    }

   static boolean findsum(int arr[], int n) {
        Set<Integer> set = new HashSet();
        int prefix_sum = 0;
        for (int i = 0; i < n; i++) {
            prefix_sum += arr[i];
            if (prefix_sum == 0) {
                return true;
            }
            if (set.contains(prefix_sum)) {
                return true;
            }
            set.add(prefix_sum);
        }
        return false;
    }
}