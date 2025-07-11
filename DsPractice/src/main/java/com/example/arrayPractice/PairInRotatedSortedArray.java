package com.example.arrayPractice;

public class PairInRotatedSortedArray {

    // Function to check if there is a pair with the given target sum
    public static boolean hasPairWithSum(int[] nums, int targetSum) {
        int n = nums.length;

        // Step 1: Find the pivot (smallest element's index)
        int pivotIndex = findPivotIndex(nums);  // The array is rotated around this point

        // Step 2: Setup two pointers
        int leftPointer = pivotIndex; // Points to the smallest element
        int rightPointer = (pivotIndex - 1 + n) % n; // Points to the largest element

        // Step 3: Use circular two-pointer technique
        while (leftPointer != rightPointer) {
            int leftValue = nums[leftPointer];
            int rightValue = nums[rightPointer];
            int currentSum = leftValue + rightValue;

            System.out.println("Checking pair: (" + leftValue + ", " + rightValue + ") → Sum = " + currentSum);

            if (currentSum == targetSum) {
                System.out.println("✅ Pair found!");
                return true;
            } else if (currentSum < targetSum) {
                // Move left pointer forward (in circular fashion)
                leftPointer = (leftPointer + 1) % n;
            } else {
                // Move right pointer backward (in circular fashion)
                rightPointer = (rightPointer - 1 + n) % n;
            }
        }

        System.out.println("❌ No pair found.");
        return false;
    }

    // Helper function to find the index of the minimum element (pivot point)
    private static int findPivotIndex(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return i + 1;
            }
        }
        return 0; // No rotation
    }

    // Main method to test the code
    public static void main(String[] args) {
        int[] nums = {11, 15, 6, 8, 9, 10};
        int targetSum = 16;

        boolean result = hasPairWithSum(nums, targetSum);
        System.out.println("Result: " + result);  // Output: true
    }
}
