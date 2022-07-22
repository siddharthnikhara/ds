package com.example.stackPractice;

import java.util.Stack;

public class NextGreateElementPractice2 {
    static int arr[] = {1, 4, 2, 3};

    public static void main(String[] args) {
        printNGE();
    }

    static void printNGE() {
        Stack<Integer> stack = new Stack<>();
        int result[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            if (!stack.isEmpty()) {
                while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                    stack.pop();
                }
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i] + " --> " + result[i]);

    }
}