package com.example.hashing;

public class SlidingWindowTechnique {
    public static void main(String[] args) {
        int arr[] = {-2,10,1,3,2,-1,4,5};
        System.out.println(slidingWindowTechnique(arr));
    }

     static int slidingWindowTechnique(int[] arr) {
        int min =Integer.MAX_VALUE;
        int sum=0;
        int increasedSum=2;
        for(int i=0;i<arr.length;i++){
            if(i==0) {
                sum = arr[i] + arr[i + 1] + arr[increasedSum];
            }else{
                if(increasedSum!=arr.length-1) {
                    increasedSum++;
                    sum = sum - arr[i - 1] + arr[increasedSum];
                    if(min>sum){
                        min=sum;
                    }
                }
            }
        }
        return min;
    }
}