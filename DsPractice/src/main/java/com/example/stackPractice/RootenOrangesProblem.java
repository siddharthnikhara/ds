package com.example.stackPractice;

import java.util.LinkedList;
import java.util.Queue;

public class RootenOrangesProblem {

    static int dx[] = {1, 0, -1, 0};
    static int dy[] = {0, 1, 0, -1};

    public static int numberOfDays(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int days = 0, countOfOnes = 0;
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 2) {
                    q.add(new int[]{i, j});
                }
                if (grid[i][j] == 1) {
                    countOfOnes += 1;
                }
            }
        }
        if (countOfOnes == 0) {
            return 0;
        }
        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                int[] temp = q.remove();
                int i = temp[0], j = temp[1];
                for (int l = 0; l < 4; l++) {
                    int nr = i + dx[l], nc = j + dy[l];
                    if (nr < 0 || nc < 0 || nr == r || nc == c) {
                        continue;
                    }
                    if (grid[nr][nc] == 1) {
                        countOfOnes -= 1;
                        q.add(new int[]{
                                nr,
                                nc
                        });
                        grid[nr][nc] = 2;
                    }
                }
            }
            if (q.size() > 0) {
                days += 1;
            }
        }
        return countOfOnes == 0 ? days : -1;
    }

    public static void main(String[] args) {
        int arr[][] = {{2, 1, 0, 2, 1},
                {1, 0, 1, 2, 1},
                {1, 0, 0, 2, 1}};
        int ans = numberOfDays(arr);
        if (ans == -1)
            System.out.println("All oranges cannot rot");
        else
            System.out.println("Time required for all oranges to rot = " + ans);
    }

}