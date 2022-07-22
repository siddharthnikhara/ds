package com.example.sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 98, 89};
        insertionSort(arr);
        printArray(arr);
    }

     static void insertionSort(int a[]) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int current = a[i];
            int j = i - 1;
            while (j >= 0 && current < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j+1] = current;
        }
    }

    static void printArray(int a[]) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}

