package com.example.sort;

public class SelectionSort3 {
    public static void main(String[] args) {
        int arr[] = {32,43,54,2321,5462,232,764,1,23};
        int n= arr.length;
        for(int i = 0;i<n;i++){
            int smallest=i;
            for(int j=i+1;j<n;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        printArray(arr);
    }
    static void printArray(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
