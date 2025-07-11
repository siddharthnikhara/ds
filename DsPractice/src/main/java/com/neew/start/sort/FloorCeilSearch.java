package com.neew.start.sort;

public class FloorCeilSearch {
    public static void main(String[] args) {
        int a[] = {2, 5, 6, 7, 12, 15, 46, 67};
        System.out.println(ceilSearch(a, 0, a.length, 8));
        System.out.println(floorSearch(a, 0, a.length, 8));
    }

    private static  int ceilSearch(int arr[], int low, int high, int no){
        int ans = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == no){
                return mid;
            }
            if(arr[mid]>no){
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return arr[low];
    }

    private static  int floorSearch(int arr[], int low, int high, int no){
        int ans = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == no){
                return mid;
            }
            if(arr[mid]>no){
                high = mid-1;
            }
            else {
                ans = mid;
                low = mid+1;
            }
        }
        return arr[ans];
    }
}
