package com.example.recursion;

public class PrintHeightOfXpower_N {
    public static void main(String[] args) {
        System.out.println(calculatePower(2,5));
    }
    static int calculatePower(int x, int n){
        if(n==0 ){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int res= calculatePower(x,n-1);
        int power = x*res;
        return power;
    }
}