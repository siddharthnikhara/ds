package com.example.sort;

public class InsertionSortPractice2 {
    public static void main(String[] args) {
        int a[] = {12, 15, 38, 243, 9, 534, 54, 98};
        sort(a);
        printArray(a);
    }
    static void sort(int a[]){
        int n =a.length;
        for(int i=1;i<n;i++){
            int current =a[i];
            int j=i-1;
            while(j>=0 && current < a[j]){
                a[j+1] =a[j];
                j--;
            }
            a[j+1]=current;
        }
    }
    static void printArray(int a[]) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
