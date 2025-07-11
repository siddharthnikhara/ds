package com.example.searchingAndsorting;

public class BinarySearch1 {
    public static void main(String[] args) {
        int ar[]={2,4,6,8,10,12};
        int x= 4;
        System.out.println(search(ar, x));
    }

    static int search(int arr[], int x){
        int low = 0; int high = arr.length;
        while (low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid] == x){
                return mid;
            }
            if(arr[mid]>x){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }
}
