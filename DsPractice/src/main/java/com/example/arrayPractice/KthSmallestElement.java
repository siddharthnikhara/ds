package com.example.arrayPractice;

import java.util.PriorityQueue;

public class KthSmallestElement {

    public static int kthSmallest(int[] arr, int k) {
        // Min-heap stores all elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add all elements to heap
        for (int num : arr) {
            minHeap.offer(num);
        }

        // Pop (k-1) smallest elements
        for (int i = 1; i < k; i++) {
            minHeap.poll();
        }

        // The kth smallest is now at the top
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        System.out.println("Kth smallest element is: " + kthSmallest(arr, k));
    }
}
