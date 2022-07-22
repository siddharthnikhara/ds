package com.example.sort;

public class QuickSort {
    public static void main(String[] args) {
        int a[] = {12, 15, 38, 243, 9, 534, 54, 98};
        quickSort(a,0,a.length-1);
        printArray(a);
    }

    static void quickSort(int a[], int l, int h) {
        if (l < h) {
            int pivot = partition(a, l, h);
            quickSort(a, l, pivot - 1);
            quickSort(a, pivot + 1, h);
        }
    }

    private static int partition(int[] a, int l, int h) {
        int i=l-1;
        int pivot = a[h];
        for(int j=l;j<h;j++){
            if(a[j]<pivot){
                i++;
                int temp= a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        i++;
        int temp=a[i];
        a[i]=a[h];
        a[h]=temp;
        return i;
    }
    static void  printArray(int arr[]) {
        int n = arr.length, i;
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
