package com.example.arrayPracticeNew;

import java.util.*;

public class KthSmallestMaxHeapComparator {
    static int kthSmallest(int[] v, int N, int K) {
        PriorityQueue<Integer> heap1 = new PriorityQueue<Integer>(new MinHeapComparator());
        for (int i = 0; i < N; ++i) {
            heap1.add(v[i]);
            if (heap1.size() > K) {
                heap1.remove();
            }
        }
        return heap1.peek();
    }

    public static void main(String[] args) {
        int[] vec = {10, 5, 4, 3, 48, 15, 6, 2, 33, 53, 10};
        int N = vec.length;
        int K = 4;
        System.out.println("Kth Smallest Element: " + kthSmallest(vec, N, K));
    }
}


class MinHeapComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer number1, Integer number2) {
        int value = number1.compareTo(number2);
        if (value > 0) {
            return -1;
        } else if (value < 0) {
            return 1;
        } else {
            return 0;
        }
    }
}