package com.example.stackPractice;

import java.util.Stack;

public class StockSpanProblem {
    public static void main(String[] args) {
        int price[] = {100, 80, 60, 70, 60, 75, 85};
        //int price[] = {10, 4, 5, 90, 120, 80};
        stockSpanProblem(price, 7);
    }

    static void stockSpanProblem(int arr[], int n) {
        Stack<Integer> stack = new Stack();
        int output[] = new int[n];
        int idx = 1, i;
        for (i = 0; i < n; i++) {
            int ele = arr[i];
            if (stack.isEmpty()) {
                stack.push(ele);
                output[i] = idx;
            } else if (ele > stack.peek()) {
                output[i] = count(ele, stack, 1);
                stack.push(ele);
            } else {
                stack.push(ele);
                output[i] = idx;
            }
        }
        for (int j = 0; j < output.length; j++) {
            System.out.print(output[j] + " ");
        }
    }

    private static int count(int ele, Stack<Integer> stack, int idx) {
        if (!stack.isEmpty() && ele > stack.peek()) {
            int data = stack.peek();
            stack.pop();
            idx = idx + 1;
            idx = count(ele, stack, idx);
            stack.push(data);
        }
        return idx;
    }
}