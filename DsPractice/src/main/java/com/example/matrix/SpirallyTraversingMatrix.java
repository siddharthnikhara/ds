package com.example.matrix;

import java.util.ArrayList;

public class SpirallyTraversingMatrix {
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3, 14}, {4, 5, 6, 15}, {7, 8, 9, 16}, {10, 11, 12, 17}};
        ArrayList<Integer> res = spirallyTraversingMatrix(a, 4, 4);
        res.forEach(System.out::println);
    }

    static ArrayList<Integer> spirallyTraversingMatrix(int a[][], int r, int c) {
        int top = 0;
        int bottom = r - 1;
        int left = 0;
        int right = c - 1;

        ArrayList<Integer> ans = new ArrayList();

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                ans.add(a[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                ans.add(a[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(a[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(a[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}