package com.example.searchingAndsorting;

import java.util.Arrays;

public class CountTriplets {

    static int countTriplets(int arr[], int n, int sum) {
        Arrays.sort(arr);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - 2; j++) {
                if ((arr[i] + arr[j] + arr[j+1]) < sum) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{-2, 0, 1, 3};
        int sum = 2;
        System.out.println(countTriplets(arr, arr.length, sum));
    }
}
