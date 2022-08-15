package com.example.backtracking;

import java.util.ArrayList;

public class RatInMaze {

    static ArrayList<String> ans = new ArrayList<>();

    public static void main(String args[]) {
        int maze[][] = {{1, 0, 0, 0},
                        {1, 1, 0, 1},
                        {1, 1, 0, 0},
                        {1, 1, 1, 1}};

        ArrayList<String> s = findPath(maze, 4);
        s.forEach(System.out::println);
    }


    public static ArrayList<String> findPath(int[][] m, int n) {
        fnc(m, n, 0, 0, "");
        return ans;
    }

    static void fnc(int[][] m, int n, int i, int j, String s) {
        if (i == n-1 && j == n-1) {
            if (m[i][j] == 1) {
                ans.add(s);
                return;
            }
        }
        if (i < 0 || j < 0 || i >= n || j >= n || m[i][j] == 0) {
            return;
        }
        m[i][j] = 0;
        //right
        fnc(m, n, i, j + 1, s + 'R');
        //up
        fnc(m, n, i - 1, j, s + 'U');
        //left
        fnc(m, n, i, j - 1, s + 'L');
        //down
        fnc(m, n, i + 1, j, s + 'D');

        m[i][j] = 1;
    }

}
