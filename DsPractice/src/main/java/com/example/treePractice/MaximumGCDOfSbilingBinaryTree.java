package com.example.treePractice;

import java.util.*;
import java.lang.*;

public class MaximumGCDOfSbilingBinaryTree {

    static int max_gcd(ArrayList<int[]> v) {
        if (v.size() == 1 || v.size() == 0)
            return 0;

        Collections.sort(v, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        int[] a = v.get(0);
        int[] b = new int[2];
        int ans = Integer.MIN_VALUE;

        for (int i = 1; i < v.size(); i++) {
            b = v.get(i);
            if (b[0] == a[0])
                ans = Math.max(ans, gcd(a[1], b[1]));
            a = b;
        }
        return ans;
    }

    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        ArrayList<int[]> v = new ArrayList<>();
        v.add(new int[]{5, 4});
        v.add(new int[]{5, 8});
        v.add(new int[]{4, 6});
        v.add(new int[]{4, 9});
        v.add(new int[]{8, 10});
        v.add(new int[]{10, 20});
        v.add(new int[]{10, 30});
        System.out.println(max_gcd(v));
    }
}