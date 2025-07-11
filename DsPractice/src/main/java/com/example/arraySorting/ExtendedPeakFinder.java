package com.example.arraySorting;

public class ExtendedPeakFinder {
    /**
     * Returns the index of any peak (≥ neighbours) in O(log n).
     * Works with duplicates and plateaus.
     */
    public static int findPeak(int[] nums) {
        if (nums == null || nums.length == 0)
            throw new IllegalArgumentException("array must be non-empty");

        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            /* Fetch neighbours safely */
            int leftVal  = (mid - 1 >= 0)            ? nums[mid - 1] : Integer.MIN_VALUE;
            int midVal   = nums[mid];
            int rightVal = (mid + 1 < nums.length)   ? nums[mid + 1] : Integer.MIN_VALUE;

            /* ② Peak found */
            if (midVal >= leftVal && midVal >= rightVal) {
                return mid;
            }

            /* ③ Go left if slope rises to the left */
            if (leftVal > midVal) {
                right = mid - 1;
            }
            /* ④ Otherwise the slope rises to the right */
            else {
                left = mid + 1;
            }
        }
        // left == right: single element must be a peak
        return left;
    }

    /* Small demo */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 6, 6, 6, 6, 6, 6, 7, 4, 3, 2, 1};
        int idx = findPeak(arr);
        System.out.println("Peak value " + arr[idx] + " at index " + idx);
        // One possible run prints: Peak value 7 at index 11
    }
}
