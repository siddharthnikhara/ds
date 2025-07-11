package com.july.sorting;

/*
public class Test1 {
    public static void main(String[] args) {
        for (int a : sortArray(new int[]{3, 5, 3, 7, 23, 6})) {
            System.out.println(a);
        }
    }

    public static void mergeSort(int arr[], int temp[], int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2; // Avoids potential overflow
            mergeSort(arr, temp, low, mid);
            mergeSort(arr, temp, mid + 1, high);
            merge(arr, temp, low, mid, high);
        }
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[nums1.length];
        mergeSortImpl(nums1, temp, 0, n, nums1.length-1);
    }

    public static void mergeSortImpl(int arr[], int temp[], int low, int mid, int high){
        for(int i=low;i<=high;i++){
            temp[i]=arr[i];
        }
        int left = low, right = mid+1, index =low;
        while(left<=mid && mid<= high){
            if(temp[left]<= temp[right]){
                arr[index]=temp[left];
                left++;
            }
            else {
                arr[index] = temp[right];
                right++;
            }
            index++;
        }

        while(left<=mid){
            arr[index]=temp[left];
            left++;
            index++;
        }
    }
}
*/
