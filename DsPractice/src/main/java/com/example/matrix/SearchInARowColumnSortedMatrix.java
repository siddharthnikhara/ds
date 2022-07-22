package com.example.matrix;

public class SearchInARowColumnSortedMatrix {
    public static void main(String[] args) {
        int n=3,m=3,x=54;
        int a[][]={{3,30,38},{36,43,54},{60,64,68}};
        System.out.println(searchInARowColumnSortedMatrix(a,n,m,x));
    }
    static boolean searchInARowColumnSortedMatrix(int a[][], int n, int m , int x){
        int row=0;
        for(int i=0;i<n;i++){
            if(a[i][0]==x){
                return true;
            }else if(a[i][0]>x){
                row=i-1;
                break;
            }else{
                row=i;
            }
        }
        if(row>=0){
            for(int i=0;i<m;i++){
                if(a[row][i]==x){
                    return true;
                }
            }
        }
        return false;
    }
}