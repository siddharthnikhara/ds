package com.example.arrayPractice;

import java.util.ArrayList;
import java.util.List;

public class SetMatrixZero {
    public static void main(String[] args) {
        int a[][] = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        List<int[]> zeroIndices = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] == 0) {
                    zeroIndices.add(new int[]{i, j});
                }
            }
        }

        for (int[] indices : zeroIndices) {
            int row = indices[0];
            int column = indices[1];

            // Set entire row to 0
            for (int i = 0; i < a[row].length; i++) {
                a[row][i] = 0;
            }

            // Set entire column a 0
            for (int i = 0; i < a.length; i++) {
                a[i][column] = 0;
            }
        }

        System.out.println("Modified 2D array:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
