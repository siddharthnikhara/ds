package com.example.stackPractice;

import java.util.Stack;

public class StackPermutationP {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3};
        int arr2[] = {2, 1, 3};
        System.out.println(checkStackPermutation(arr1, arr2));
    }

    static boolean checkStackPermutation(int arr1[], int arr2[]) {
        Stack<Integer> stack = new Stack<>();
        int idx = 0;
        int n = arr1.length;
        for (int i = 0; i < n; i++) {
            stack.push(arr1[i]);
            while (!stack.isEmpty() && stack.peek() == arr2[idx]) {
                ++idx;
                stack.pop();
            }
        }
        return idx == n;
    }
}
