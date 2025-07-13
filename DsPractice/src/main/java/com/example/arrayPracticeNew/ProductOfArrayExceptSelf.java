package com.example.arrayPracticeNew;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int res[] = productOfArrayExceptSelf(arr);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }

    public static int[] productOfArrayExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Step 1: Left product
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Step 2: Right product and final result
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * rightProduct;
            rightProduct *= nums[i];
        }

        return result;
    }
}
