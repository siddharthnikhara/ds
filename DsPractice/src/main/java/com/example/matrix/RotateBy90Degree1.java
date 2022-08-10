package com.example.matrix;

public class RotateBy90Degree1 {
    public static void main(String[] args) {
        int a[][]=
                {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};//{{1,2,3},{4,5,6},{7,8,9}};
        rotateBy90Degree(a,4);
    }
    static void rotateBy90Degree(int a[][], int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp=a[i][j];
                a[i][j]=a[i][n-1-j];
                a[i][n-1-j]=temp;
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