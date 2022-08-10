package com.example.arrayPracticeNew;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int arr[]={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
    static int maxArea(int arr[]){
        int start=0;
        int end=arr.length-1;
        int area;
        int maxArea=0;

        while (start<end){
            area= Math.min(arr[start],arr[end])*(end-start);
            if(area>maxArea) {
                maxArea = area;
            }
            if(Math.min(arr[start],arr[end])==arr[start]){
                start++;
            }else{
                end--;
            }
        }
        return maxArea;
    }
}
