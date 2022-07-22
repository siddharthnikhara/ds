package com.example.stackPractice;

public class CelebrityProblemWithoutStack {
    public static void main(String[] args) {
        int a[][] = {{0, 1, 0},
                {0, 0, 0},
                {0, 1, 0}};
        System.out.println(checkCelebrityProblem(a, 3));
    }

    static int checkCelebrityProblem(int a[][], int n) {
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (a[c][i] == 1) {
                c = i;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i != c && (a[c][i] == 1 || a[i][c] == 0)) {
                return -1;
            }
        }
        return c;
    }
}
