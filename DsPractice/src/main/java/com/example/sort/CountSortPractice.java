package com.example.sort;

public class CountSortPractice {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 1, 3, 0, 1, 4,0,5};
        countSort(arr, 6);
        printArray(arr);
    }

    static void countSort(int a[], int k) {
        int count[] = new int[k];
        int output[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            count[a[i]]++;
        }
        for (int i = 1; i <  count.length; i++) {
            count[i] = count[i] + count[i - 1];
        }
        for (int i = a.length-1; i >= 0; i--) {
            output[--count[a[i]]] = a[i];
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = output[i];
        }
    }
}