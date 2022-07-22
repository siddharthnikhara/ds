package com.example.stackPractice;

import java.util.Stack;

public class PrefixToPostfix {
    public static void main(String[] args) {
        prefixToPostfix("*-A/BC-/AKL");
    }

    static void prefixToPostfix(String s) {
        Stack<String> stack = new Stack<>();
        char ch[] = s.toCharArray();
        int i, length = s.length();
        for (i = length - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (isOperator(c)) {
                String s1 = stack.pop();
                String s2 = stack.pop();

                String temp = s1 + s2 + c;
                stack.push(temp);
            } else {
                stack.push(c + "");
            }
        }
        System.out.println(stack.peek());
    }

    static boolean isOperator(char c) {
        switch (c) {
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
                return true;
        }
        return false;
    }
}
