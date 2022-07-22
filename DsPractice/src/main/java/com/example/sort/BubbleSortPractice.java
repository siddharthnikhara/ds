package com.example.sort;

public class BubbleSortPractice {
    public static void main(String[] args) {
        int a[]= {12,15,38,9,54,98,243,534};
        sort(a);
        printArray(a);

    }
    public static void sort(int a[]){
        int n=a.length;
        for(int i =0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp= a[j];
                    a[j]=a[j+1];
                    a[j+1]= temp;
                }
            }
        }
    }
    static void printArray(int a[]){
        int n = a.length;
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}