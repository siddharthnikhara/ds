package com.example.searchingAndsorting;

public class QuickSort1 {
    public static void main(String[] args) {
        int ar[]={10,4,6,84,20,124,30};
        int low = 0; int high = ar.length-1;
        sort(ar, low, high);
        for(int i = 0; i<ar.length; i++) {
            System.out.println(ar[i]);
        }
    }

    static void sort(int arr[], int low, int high){
        if(low<high){
            int partiton = partition(arr, low, high);
            sort(arr, low, partiton-1);
            sort(arr, partiton+1, high);
        }
    }

    static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for (int j = low; j<high; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i]= pivot;
        arr[high] = temp;
        return i;
    }
}
