package com.example.arrayPracticeNew;

public class TrippingWater {
    public static void main(String[] args) {
        int arr[] = {3, 0, 2, 0, 4};//{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trippingWater(arr, arr.length));
    }

    static int trippingWater(int arr[], int n) {
        int left = 0;
        int right = n - 1;
        int leftBar = arr[0];
        int rightBar = arr[n - 1];
        int ans = 0;
        while (left <= right) {
            //which bar is limiting bar
            //left, right?
            if (leftBar < rightBar) {
                //if element that we are seeing right now, if that becomes the highest left, it will not store any water
                if (arr[left] > leftBar) {
                    leftBar = arr[left];
                }
                //it will store water
                else {
                    ans += leftBar - arr[left];
                    left++;
                }
            } else {
                if (arr[right] > rightBar) {
                    rightBar = arr[right];
                } else {
                    ans += rightBar - arr[right];
                    right--;
                }
            }
        }
        return ans;
    }
}
