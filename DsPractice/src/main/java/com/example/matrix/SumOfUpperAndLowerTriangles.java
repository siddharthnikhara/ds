package com.example.matrix;

public class SumOfUpperAndLowerTriangles {
    public static void main(String[] args) {
        int a[][]={{6,5,4},{1,2,5},{7,9,7}};
        System.out.println(sumOfUpperAndLowerTriangles(a));
    }
    static String sumOfUpperAndLowerTriangles(int a[][]){
        int m= a.length;
        int n=a[0].length;
        String s="";
        int lower = 0;
        int upper =0;
        for(int i=0;i<m;i++){
            for(int j=i;j<n;j++){
                lower+=a[i][j];
                upper+=a[j][i];
            }
        }
        s = lower +" " +upper;
        return s;
    }
}