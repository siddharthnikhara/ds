package com.example.matrix;

public class SumOfMatrix {
    public static void main(String[] args) {
        int a[][]={{1,0,1},{-8,9,-2}};
        System.out.println(sumOfMatrix(a));
    }
    static int sumOfMatrix(int a[][]){
        int result=0;
        int n= a.length;
        int m=a[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                result+=a[i][j];
            }
        }
        return result;
    }
}