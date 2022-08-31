package com.example.stackPractice;

import java.util.Stack;

public class CelebrityProblemUsingStack {
    public static void main(String[] args) {
        int a[][] = {{0, 1, 0},
                {0, 0, 0},
                {0, 1, 0}};
        System.out.println(checkCelebritProblem(a, 3));
    }

    static int checkCelebritProblem(int a[][], int n) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(i);
        }
        while (stack.size() > 1) {
            int a1 = stack.pop();
            int b1 = stack.pop();
            if (a[a1][b1] == 0) {
                stack.push(a1);
            } else {
                stack.push(b1);
            }
        }
        int top = stack.pop();
        int rowCount = 0;
        for (int i = 0; i < n; i++) {
            if (a[top][i] == 0) {
                rowCount++;
            }
        }
        if (rowCount != n) {
            return -1;
        }
        int columCount = 0;
        for (int i = 0; i < n; i++) {
            if (a[i][top] == 1) {
                columCount++;
            }
        }
        if (columCount != n - 1) {
            return -1;
        }
        return top;
    }
}