package com.example.matrix;

import java.util.LinkedList;
import java.util.Queue;

public class NearestCellHAving1inBinaryMatrix {
    private static void minimumDistance(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int ans[][] = new int[n][m];
        Queue<Coordinate> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 1) {
                    queue.add(new Coordinate(i, j));
                }
            }
        }
        int minDistance = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            // Run a loop size times
            for (int i = 0; i < size; i++) {
                // remove an element from queue
                Coordinate curr = queue.poll();
                // ans to this coordinate is minDistance
                ans[curr.row][curr.col] = minDistance;
                // enqueue all the valid adjacent cells of curr that are equals to
                // 0 in the matrix array and set them as 1
                // left adjacent
                int leftRow = curr.row - 1;
                int leftCol = curr.col;
                if ((leftRow >= 0 && leftRow < n) && (leftCol >= 0 && leftCol < m)) {
                    if (matrix[leftRow][leftCol] == 0) {
                        queue.add(new Coordinate(leftRow, leftCol));
                        matrix[leftRow][leftCol] = 1;
                    }
                }
                // right adjacent
                int rightRow = curr.row + 1;
                int rightCol = curr.col;
                if ((rightRow >= 0 && rightRow < n) && (rightCol >= 0 && rightCol < m)) {
                    if (matrix[rightRow][rightCol] == 0) {
                        queue.add(new Coordinate(rightRow, rightCol));
                        matrix[rightRow][rightCol] = 1;
                    }
                }
                // up adjacent
                int upRow = curr.row;
                int upCol = curr.col + 1;
                if ((upRow >= 0 && upRow < n) && (upCol >= 0 && upCol < m)) {
                    if (matrix[upRow][upCol] == 0) {
                        queue.add(new Coordinate(upRow, upCol));
                        matrix[upRow][upCol] = 1;
                    }
                }
                // down adjacent
                int downRow = curr.row;
                int downCol = curr.col - 1;
                if ((downRow >= 0 && downRow < n) && (downCol >= 0 && downCol < m)) {
                    if (matrix[downRow][downCol] == 0) {
                        queue.add(new Coordinate(downRow, downCol));
                        matrix[downRow][downCol] = 1;
                    }
                }
            }
            // increment minimum distance
            minDistance++;
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
                {0, 1, 0},
                {0, 0, 0},
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