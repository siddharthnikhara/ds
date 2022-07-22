package com.example.pattern;

public class Pattern12 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=n;j> 0;j--){
                if(j<=i){
                    System.out.print(i+" ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}