package com.example.stackPractice;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 4};
        int n = 4;
        nextGreaterElement(arr, n);
    }

    static void nextGreaterElement(int arr[], int n) {
        Stack<Integer> stack = new Stack<>();
        int output[] = new int[n];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            output[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i] + " --> " + output[i]);
    }
}
