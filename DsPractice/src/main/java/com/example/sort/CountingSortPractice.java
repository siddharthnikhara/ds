package com.example.sort;

public class CountingSortPractice {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 2, 3, 1, 2, 4};
        countSort(arr, 5);
        printArray(arr);
    }

    static void countSort(int a[], int k) {
        int n = a.length;
        int count[] = new int[k];
        int output[] = new int[n];
        for (int i = 0; i < n; i++) {
            count[a[i]]++;
        }
        for (int i = 1; i < k; i++) {
            count[i] += count[i - 1];
        }
        for (int i = a.length - 1; i >= 0; i--) {
            output[--count[a[i]]] = a[i];
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = output[i];
        }
    }
}
