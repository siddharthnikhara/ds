package com.testing.myself;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {

    }

    static int search(int arr[], int l, int h, int key) {
        if(l<=h) {
            int mid = l+(h-l)/2;
            if (arr[mid] == key) {
                return mid;
            }

            if(arr[l] <= arr[mid]) {
                if(arr[l] <= key && key < arr[mid]) {
                    return search(arr, l, mid-1, key);
                }
                return search(arr, mid+1, h, key);
            }
            else {
                if(arr[mid] < key && key <= arr[h]) {
                    return search(arr, mid+1, h, key);
                }
                return search(arr, l, mid-1, key);
            }
        }
        return -1;
    }
}
