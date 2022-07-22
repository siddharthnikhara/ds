package com.example.recursion;

public class  SumOfFirstNnaturalNo {
    public static void main(String[] args) {
         printSum(1,5,0);
    }
    static void printSum(int i, int n, int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printSum(i+1,n,sum);
    }
}