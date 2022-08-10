package com.example.arrayPracticeNew;

public class FindMinimumInRotatedSortedArrayRecomonded {
    public static void main(String[] args) {
        int arr1[] ={ 1, 2, 3, 4 }; //{ 5, 6, 7, 1, 2, 3, 4 };//{ 1, 2, 3, 4 };//{5, 6, 1, 2, 3, 4};
        System.out.println("The minimum element is " + findMin(arr1));
    }

    public static int findMin(int arr[]) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] == arr[high]) {
                high--;
            } else if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return arr[high];
    }
}
