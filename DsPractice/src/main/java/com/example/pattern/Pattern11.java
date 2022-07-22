package com.example.pattern;

public class Pattern11 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            int spaces = n-i;
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }
            for(int k=0;k<n;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}