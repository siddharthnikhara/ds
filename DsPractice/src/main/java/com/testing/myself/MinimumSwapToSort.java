package com.testing.myself;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinimumSwapToSort {
    public static void main(String[] args) {

    }

    int minSwapToSort(int arr[], int n){
        int ans=0;
        int temp[]= Arrays.copyOfRange(arr,0, n);
        Arrays.sort(temp);
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i], i);
        }
        for(int i =0;i<n;i++){
            if(arr[i]!=temp[i]){
                ans++;
                swap(arr, i, map.get(arr[i]));
                map.put(i,map.get(arr[i]));
            }
        }
        return ans;
    }

    void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
