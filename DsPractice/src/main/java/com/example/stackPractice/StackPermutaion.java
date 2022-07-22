package com.example.stackPractice;

import java.util.Stack;

public class StackPermutaion {
    static boolean checkStackPermutation(int ip[], int op[]) {
        Stack stack = new Stack();
        int i = 0, n = ip.length;
        for (int num : ip) {
            stack.push(num);
            while (!stack.isEmpty() && (int) stack.peek() == op[i]) {
                stack.pop();
                ++i;
            }
        }
        return i == n;
    }

    public static void main(String[] args) {
        int input[] = {1, 2, 3};
        int output[] = {2, 1, 3};
        if (checkStackPermutation(input, output))
            System.out.println("Yes");
        else
            System.out.println("Not Possible");
    }
}