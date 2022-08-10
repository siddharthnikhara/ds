package com.example.matrix;

public class ZigzagDiagonalTraversalOfMatrix {
    static final int ROW = 5;
    static final int COL = 4;
    static int min(int a, int b) {
        return (a < b) ? a : b;
    }
    static int min(int a, int b, int c) {
        return min(min(a, b), c);
    }
    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    static void diagonalOrder(int matrix[][]) {
        for (int line = 1; line <= (ROW + COL - 1); line++) {
            int start_col = max(0, line - ROW);
            int count = min(line, (COL - start_col), ROW);
            for (int j = 0; j < count; j++) {
                System.out.print(matrix[min(ROW, line) - j - 1][start_col + j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int M[][] = {
                {1, 2, 3, 4}, {5, 6, 7, 8},
                {9, 10, 11, 12}, {13, 14, 15, 16},
                {17, 18, 19, 20},
        };
        diagonalOrder(M);
    }
}