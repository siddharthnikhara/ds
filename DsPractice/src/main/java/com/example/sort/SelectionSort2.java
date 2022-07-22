package com.example.sort;

public class SelectionSort2 {
    public static void main(String[] args) {
        int arr[] = {34,43,54,1,53,64,32};
        int n=arr.length,i,j;
        for(i=0;i<n-1;i++){
            int smallest=i;
            for(j=i+1;j<n;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        printArray(arr);
    }
    static void printArray(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
