package com.example.sort;

public class QuickSort2 {
    public static void main(String[] args) {
        int a[] = {12, 15, 38, 243, 9, 534, 54, 98};
        quickSort(a, 0, a.length - 1);
        printArray(a);
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pidx = partition(arr, low, high);
            quickSort(arr, low, pidx - 1);
            quickSort(arr, pidx + 1, high);
        }
    }

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }

    static void printArray(int arr[]) {
        int n = arr.length, i;
        for (i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}