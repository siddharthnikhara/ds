package com.example.arraySearhing;

public class FindPeakElement {
    public static void main(String[] args) {
        int arr[] = {1,20,3,4,5,6,7,8,9,10,20,30,40};//{1,2,3,4,5,6,7,8,5,1};//{1,20,3,4,5,6,7,8,9,10,20,30,4};//new int[5];
        System.out.println(findPeakElement(arr));
    }

    public static int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return 0;
        }
        if(nums[0]>nums[1]){
            return 0;
        }
        if(nums[n-1]>nums[n-2]){
            return n-1;
        }
        int low = 1, high = n-2;
        while(low<=high){
            int mid = (low + high)/2;
            if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1]){
                return mid;
            }
            else if(nums[mid]>nums[mid-1]){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }
}
