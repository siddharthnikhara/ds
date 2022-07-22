package com.example.hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionOf2Arrays {
    public static void main(String[] args) {
        int a[] = {1 ,2 ,3, 4, 5};
        int b[] = {1, 2,3};
        System.out.println(unionOf2Array(a, 5 ,b, 3));
    }

    static int unionOf2Array(int a[], int n, int b[], int m) {
        HashSet<Integer> set = new HashSet<>();

//        set.addAll(Arrays.asList(firstArray));
//
//        set.addAll(Arrays.asList(secondArray));

        System.out.println(set);

        //convert to array
        Integer[] union = {};
        union = set.toArray(union);
        return 0;
    }
}