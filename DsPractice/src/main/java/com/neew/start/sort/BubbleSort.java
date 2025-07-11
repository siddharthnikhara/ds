package com.neew.start.sort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 98, 89};
        BubbleSort bubbleSort = new BubbleSort();
       // bubbleSort.selectionSortArray(arr);
        int low = 0, high = arr.length-1;
        bubbleSort.quickSortArray(arr, low, high);
        bubbleSort.printArray(arr);
    }

    private void bubbleSortedArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    private void selectionSortArray(int[] arr) {
        int n = arr.length, i , j;
        for (i = 0; i < n; i++) {
            int smallest = i;
            for(j = i; j< n;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]= temp;
        }
    }

    void printArray(int arr[]) {
        int n = arr.length, i;
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    private void quickSortArray(int[] arr, int low, int high){
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSortArray(arr, low, pivotIndex - 1);
            quickSortArray(arr, pivotIndex + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++){ // here we will create a space and will add the same element if arr[j]<pivot
            if(arr[j]<pivot){
                i++;
                int temp =  arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        return i;
    }
}
