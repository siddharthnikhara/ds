package com.example.pattern;

public class Pattern2 {
    public static void main(String[] args) {
        int r=4;
        int l=5;
        for(int i=0;i<r;i++){
            for(int j=0 ;j<l;j++){
                if(i==0 || i==r-1 || j==0 || j==l-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
}