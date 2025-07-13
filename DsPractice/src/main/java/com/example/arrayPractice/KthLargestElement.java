package com.example.arrayPractice;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement {

    public static int findKthLargestWithIf(int[] nums, int k) {
        // Min Heap to store top k largest elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.offer(num); // add to heap
            if (minHeap.size() > k) {
                minHeap.poll(); // remove smallest among top k
            }
        }

        // Top of minHeap is the Kth largest
        return minHeap.peek();
    }

    public static int findKthLargest(int[] nums, int k) {
        // Max Heap: highest number at the top
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Add all elements to max heap
        for (int num : nums) {
            maxHeap.offer(num);
        }

        // Remove the first (k - 1) largest elements
        for (int i = 1; i < k; i++) {
            maxHeap.poll(); // remove the largest
        }

        // The Kth largest element
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println("Kth largest element: " + findKthLargest(nums, k));
        System.out.println("Kth largest element: " + findKthLargestWithIf(nums, k));
    }
}
