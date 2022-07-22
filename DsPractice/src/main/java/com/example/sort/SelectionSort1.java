package com.example.sort;

public class SelectionSort1 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 98, 89};
        SelectionSort1 selectionSort = new SelectionSort1();
        selectionSort.sort(arr);
        selectionSort.printArray(arr);
    }

    public void sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
                int temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = temp;
        }
    }

    void printArray(int arr[]) {
        int n = arr.length, i;
        for (i = 0; i < n; ++i) {
            System.out.println(arr[i]);
        }
    }
}