package com.example.matrix;

import java.util.LinkedList;
import java.util.Queue;

public class NearestCellHAving1inBinaryMatrixPractice {
    private static void minimumDistance(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int ans[][] = new int[n][m];
        Queue<Coordinate> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 1) {
                    ans[i][j]=0;
                    queue.add(new Coordinate(i, j));
                }
            }
        }
        while (!queue.isEmpty()) {
            int i= queue.peek().row;
            int j= queue.peek().col;
            if((i-1)>=0 && ans[i][j]+1<ans[i-1][j]){
                ans[i-1][j]=ans[i][j]+1;
                queue.add(new Coordinate(i-1,j));
            }
            if((j-1)>=0 && ans[i][j]+1<ans[i][j-1] ){
                ans[i][j-1]=ans[i][j]+1;
                queue.add(new Coordinate(i,j-1));
            }
            if((i+1)<n && ans[i][j]+1<ans[i+1][j] ){
                ans[i+1][j]=ans[i][j]+1;
                queue.add(new Coordinate(i+1,j));
            }
            if((j+1)<m && ans[i][j]+1<ans[i][j+1] ){
                ans[i][j+1]=ans[i][j]+1;
                queue.add(new Coordinate(i,j+1));
            }
            queue.remove();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int matrix1[][] = new int[][]{
                {1, 0, 1},
                {1, 1, 0},
                {1, 0, 0}
        };
        minimumDistance(matrix1);
        int matrix2[][] = new int[][]{
                {0, 0, 0},
                {0, 0, 0},
                {1, 0, 1}
        };
        minimumDistance(matrix2);
    }

    static class Coordinate {
        int row;
        int col;

        public Coordinate(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
}