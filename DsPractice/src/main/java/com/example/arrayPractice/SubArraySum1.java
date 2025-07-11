package com.example.arrayPractice;

public class SubArraySum1 {

    public static int subArraySum(int[] arr, int n, int sum) {
        int currSum = arr[0], start = 0;

        for (int i = 1; i <= n; i++) {
            // Shrink the window from the left
            while (currSum > sum && start < i - 1) {
                currSum -= arr[start];
                start++;
            }

            if (currSum == sum) {
                int end = i - 1;
                System.out.println("Subarray found between indexes " + start + " and " + end);
                return 1;
            }

            // Add next element
            if (i < n) {
                currSum += arr[i];
            }
        }

        System.out.println("No subarray found");
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {15, 2, 4, 8, 9, 5, 10, 23};
        int n = arr.length;
        int sum = 23;

        subArraySum(arr, n, sum);
    }

}
