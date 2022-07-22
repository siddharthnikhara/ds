package com.example.sort;

public class QuickSortPRactice {
    public static void main(String[] args) {
        int a[] = {12, 15, 38, 243, 9, 534, 54, 98};
        quickSort(a,0,a.length-1);
        printArray(a);
    }
    static void quickSort(int a[], int low, int high){
        if(low<high){
            int pidx = partition(a,low,high);
            quickSort(a,low,pidx-1);
            quickSort(a,pidx+1,high);
        }
    }

    public static int partition(int[] a, int low, int high) {
        int pivot=a[high];
        int i= low-1;
        for(int j=low;j<high;j++){
            if(a[j]<pivot){
                //here i is making space for lower element of pivot
                i++;
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        i++;
        int temp = a[i];
        a[i]=a[high];
        a[high]=temp;
       return i;
    }
    static void  printArray(int arr[]) {
        int n = arr.length, i;
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
