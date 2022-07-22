package com.example.stackPractice;

import java.util.Stack;

public class PostfixToInfix {
    public static void main(String[] args) {
        postfixToInfix("ab*c+");
    }

    static void postfixToInfix(String s) {
        Stack<String> stack = new Stack<>();
        int i, length = s.length();
        for (i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (isOperator(c)) {
                String s1 = stack.pop();
                String s2 = stack.pop();

                String temp = "(" + s2 + c + s1 + ")";
                stack.push(temp);
            } else {
                stack.push(c + "");
            }
        }
        System.out.println(stack.pop());
    }

    private static boolean isOperator(char c) {
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