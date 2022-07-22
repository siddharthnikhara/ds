package com.example.recursion;

public class FabonacciSeries {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=7;
        System.out.println(a);
        System.out.println(b);
        fabonacciSeries(a,b,n-2);
    }
    static void fabonacciSeries(int a, int b, int n){
        if(n==0){
            return;
        }
        int c= a+b;
        System.out.println(c);
        fabonacciSeries(b,c,n-1);
    }
}