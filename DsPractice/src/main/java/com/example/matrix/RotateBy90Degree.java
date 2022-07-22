package com.example.matrix;

public class RotateBy90Degree {
    public static void main(String[] args) {
        int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
        rotateBy90Degree(a,3);
    }
    static void rotateBy90Degree(int a[][], int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        for(int i=0;i<n/2;i++){
            for(int j=0;j<n;j++){
                int temp=a[i][j];
                a[i][j]=a[n-1][j];
                a[n-1][j]=temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}