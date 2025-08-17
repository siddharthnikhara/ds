package com.testing.myself;

public class ContainerWithMostWater {
    int containerWithMostWater(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        int max = 0;
        while (start < end) {
            int w = end - start;
            int h = Math.min(arr[start], arr[end]);
            int area = w * h;
            max = Math.max(area, max);
            if (arr[start] < arr[end]) {
                start++;
            } else {
                end--;
            }
        }
        return max;
    }
}
