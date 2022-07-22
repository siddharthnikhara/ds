package com.example.stackPractice;

import java.util.Stack;

public class PostfixToPrefix {
    public static void main(String[] args) {
        postfixToPrefix("ABC/-AK/L-*");
    }

    static void postfixToPrefix(String s) {
        Stack<String> stack = new Stack<>();
        int i = 0, length = s.length();
        for (i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (isOperator(c)) {
                String s1 = stack.pop();
                String s2 = stack.pop();

                String s3 =c+s2+s1;
                stack.push(s3);
            }else{
                stack.push(c+"");
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