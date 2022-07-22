package com.example.hashing;

import java.util.HashSet;


public class IntersectionOf2Array {
    public static void main(String[] args) {
        int a[] = {89, 24, 75, 11, 4, 4, 4};
        int b[] = {75, 3, 4, 4};
        System.out.println(intersectionOf2Array(a, b, a.length, b.length));
    }

    static int intersectionOf2Array(int a[], int b[], int n, int m) {
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i =0;i<n;i++){
            set.add(a[i]);
        }
        for(int i=0;i<m;i++){
            if(set.contains(b[i])){
                count++;
                set.remove(b[i]);
            }
        }
        return count;
    }
}