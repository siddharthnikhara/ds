package com.example.matrix;

public class BooleanMatrixWith0 {
    public static void main(String[] args) {
        int a[][] = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        booleanMatrix(a);
    }

    static void booleanMatrix(int a[][]) {
        int row = a.length;
        int col = a[0].length;
        boolean bo_row[] = new boolean[row];
        boolean bo_col[] = new boolean[col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (a[i][j] == 0) {
                    bo_row[i] = true;
                    bo_col[j] = true;
                }
            }
        }
        for (int i = 0; i < row; i++) {
            if (bo_row[i]) {
                for (int j = 0; j < col; j++) {
                    a[i][j] = 0;
                }
            }
        }
        for (int j = 0; j < col; j++) {
            if (bo_col[j]) {
                for (int i = 0; i < row; i++) {
                    a[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

