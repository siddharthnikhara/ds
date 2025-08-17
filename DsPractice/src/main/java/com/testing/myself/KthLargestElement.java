package com.testing.myself;

public class KthLargestElement {


    void kthLargestElement(int arr[]) {
        int arr1[] = {3,23,5,75,43,8};
        int k = 2;

        for(int i = 0;i< arr.length;i++) {
            if(k == i+1){
                break;
            }
            for(int j= i+1;j<arr.length;j++) {
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }
        System.out.println(arr[k-1]);
    }
}
