package com.example.sort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 98, 89};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sortedArray(arr);
        bubbleSort.printArray(arr);


    }

    void sortedArray(int[] arr) {
        int n = arr.length, i, j;
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    void printArray(int arr[]) {
        int n = arr.length, i;
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}