package com.example.arrayPracticeNew;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int res[]=productOfArrayExceptSelf(arr);
        for(int i:res){
            System.out.print(i+" ");
        }
    }

    static int[] productOfArrayExceptSelf(int arr[]) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }
        int res[] = new int[arr.length];
        //left
        int rp = 1;
        for (int i = 0; i < arr.length; i++) {
            res[i] = rp;
            rp = rp * arr[i];
        }
        rp=1;
        //right pass
        for (int i = arr.length - 1; i >= 0; i--) {
            res[i] = rp*res[i];
            rp = rp * arr[i];
        }
        return res;
    }
}
