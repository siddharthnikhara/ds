package com.example.recursion;

public class CountTotalPathsOfMatrix {
    public static void main(String[] args) {
        System.out.println(countTotalPathsOfMatrix(0,0,3,3));
    }
    static int countTotalPathsOfMatrix(int i, int j, int m, int n){
        if(i==m || j == n){
            return 0;
        }
        if(i==m-1 || j==n-1){
            return 1;
        }
        int down = countTotalPathsOfMatrix(i+1,j,m,n);
        int right = countTotalPathsOfMatrix(i,j+1,m,n);
        return down+right;
    }
}
