package com.sealedclass.example;

public class KadanesAlgorithm {

    public static void main(String args[]) {
        int arr[] = {2,4,-3,5,-6,20};
        int n = arr.length;
        int age = 308790876;
        int maxSum = maxSubarraySum(arr, n);
        System.out.println("The maximum subarray sum is: " + maxSum);

    }

    //
    public static int maxSubarraySum(int[] arr, int n) {
        int maxSubArray = arr[0];
        int currSum = arr[0];
        for(int i =1;i<n;i++){
            currSum = Math.max(arr[i], arr[i]+currSum);
            maxSubArray = Math.max(currSum, maxSubArray);
        }
        return maxSubArray;
    }
}
