package com.july.sorting;

public class MergeSort {
    public static void main(String[] args) {
       for(int a: sortArray(new int[]{3, 5, 3, 7, 23, 6})){
           System.out.println(a);
       }
    }
    public static int[] sortArray(int[] nums) {
        int[] temp = new int[nums.length];
        mergeSort(nums, temp, 0, nums.length - 1);
        return nums;
    }

    public static void mergeSort(int arr[], int temp[], int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2; // Avoids potential overflow
            mergeSort(arr, temp, low, mid);
            mergeSort(arr, temp, mid + 1, high);
            merge(arr, temp, low, mid, high);
        }
    }

    public static void merge(int arr[], int temp[], int low, int mid, int high) {
        for (int i = low; i <= high; i++) {
            temp[i] = arr[i];
        }
        int left = low;
        int right = mid + 1;
        int index = low;
        while (left <= mid && right <= high) {
            if (temp[left] <= temp[right]) {
                arr[index] = temp[left];
                left++;
            } else {
                arr[index] = temp[right];
                right++;
            }
            index++;
        }
        while (left <= mid) {
            arr[index] = temp[left];
            left++;
            index++;
        }
    }
}
