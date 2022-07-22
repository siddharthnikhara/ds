package com.example.pattern;

public class Pattern8 {
    public static void main(String[] args) {
        int n =5;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(++sum+" ");
            }System.out.println();
        }
    }
}